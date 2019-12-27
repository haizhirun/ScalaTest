package com.sencent.scala.chapter16.exercise01.client

import akka.actor.{Actor, ActorRef, ActorSelection, ActorSystem, Props}
import com.sencent.scala.chapter16.exercise01.common.{CustomerAMessage, CustomerBMessage}
import com.typesafe.config.ConfigFactory

import scala.io.StdIn

class CustomerAActor extends Actor{
  var customerBctorRef : ActorSelection= _
  override def preStart(): Unit = {
    customerBctorRef = context.actorSelection("akka.tcp://CustomerB@127.0.0.1:9000/user/CustomerBActor")
  }

  override def receive: Receive = {
    case "start" =>{
      println("started...")
    }
    case CustomerBMessage(mesB)=>{
      println(mesB)
//      val mesA: String = StdIn.readLine()
//      customerBctorRef ! CustomerAMessage(mesA)
    }
    case mes:String =>{
      customerBctorRef ! CustomerAMessage(mes)
    }
  }
}


object CustomerAActor{
  def main(args: Array[String]): Unit = {
    val customerAIp = "127.0.0.1"
    val customerAPort = 9001

    val config = ConfigFactory.parseString(
      s"""
         |akka.actor.provider="akka.remote.RemoteActorRefProvider"
         |akka.remote.netty.tcp.hostname=$customerAIp
         |akka.remote.netty.tcp.port=$customerAPort
       """.stripMargin)

    val customerA: ActorSystem = ActorSystem("CustomerA",config)

    val customerActorRef: ActorRef = customerA.actorOf(Props[CustomerAActor],"CustomerAActor")

    customerActorRef ! "start"
    Thread.sleep(2000)
    while(true){
//      print("CustomerA说: ")
      val mesA: String = StdIn.readLine()
      customerActorRef ! "CustomerA说："+ mesA
    }

  }
}
