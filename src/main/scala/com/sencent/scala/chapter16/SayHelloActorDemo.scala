package com.sencent.scala.chapter16

import akka.actor.{Actor, ActorSystem, Props}

object SayHelloActorDemo {
  def main(args: Array[String]): Unit = {
    val actorFactory = ActorSystem("actorFactory")

    val sayHelloActorRef = actorFactory.actorOf(Props[SayHelloActor],"SayHelloActor")

    sayHelloActorRef ! "start"
    sayHelloActorRef ! "hello"
    sayHelloActorRef ! "fish"
    sayHelloActorRef ! "cat"
    sayHelloActorRef ! "exit"

  }
}

class SayHelloActor extends Actor{
  override def receive: Receive = {
    case "start" => println("actor开始运行...")
    case "hello" => println("hello")
    case "fish" => println("鱼")
    case "cat" => println("猫")
    //让akka停止
    case "exit" =>{
      context.stop(self) //停止当前的actor
      context.system.terminate()//停止当前的ActorSystem
    }
  }
}
