package com.sencent.scala.chapter16.client

import akka.actor.{Actor, ActorRef, ActorSelection, ActorSystem, Props}
import com.sencent.scala.chapter16.common.{ClientMessage, ServerMessage}
import com.typesafe.config.ConfigFactory

import scala.io.StdIn

class CustomerActor extends Actor{
  var yellowChickenServerRef : ActorSelection = _

  override def preStart(): Unit = {
    println("preStart")
    //1.在akka的Actor模型中，认为每个Actor都是一个资源，通过一个Path来定位一个actor
    //2.path的组成：akka.tcp://Server的actorFactory名字@ServerIp:Server的port/user/ServerActor名字
    yellowChickenServerRef = context.actorSelection("akka.tcp://Server@127.0.0.1:9999/user/YellowChickenServer")
    println(yellowChickenServerRef)
  }
  override def receive: Receive = {
    case "start" =>{
      println("客户端启动，可以咨询问题...")
    }
    case mes:String =>{
      //将mes发送给Server
      yellowChickenServerRef ! ClientMessage(mes)
    }
    case ServerMessage(mes) =>{
      println("收到客服回复消息：" + mes)
    }
  }
}


object CustomerActor {
  def main(args: Array[String]): Unit = {
    val clientIp = "127.0.0.1"
    val clientPort = 10002

    val config = ConfigFactory.parseString(
      s"""
         |akka.actor.provider="akka.remote.RemoteActorRefProvider"
         |akka.remote.netty.tcp.hostname=$clientIp
         |akka.remote.netty.tcp.port=$clientPort
       """.stripMargin)

    //创建CustomerActor
    val clientActorSystem: ActorSystem = ActorSystem("Client",config)

    val customerActorRef: ActorRef = clientActorSystem.actorOf(Props[CustomerActor],"CustomerActor")

    customerActorRef ! "start"

    println("可以咨询问题了")

    while(true){
      val mes = StdIn.readLine()
      customerActorRef ! mes
      println(s"向CustomerActor发送$mes")
    }
  }
}