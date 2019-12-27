package com.sencent.scala.chapter16

import akka.actor.{Actor, ActorRef}

class AActor(iBActorRef:ActorRef) extends Actor{
  var bActorRef = iBActorRef
  var count = 0
  override def receive: Receive = {
    case "start" =>{
      println("AActor启动")
      //发消息给BActor
      bActorRef ! "B出招"
    }
    case "A出招" =>{
      count += 1
      println(s"A出招${count}次")
      Thread.sleep(1000)
      if(count >= 10) {
        bActorRef ! "exit"
      }else{
        bActorRef ! "B出招"
      }

    }
    case "exit" =>{
      context.stop(self)
      context.system.terminate()
    }
  }
}
