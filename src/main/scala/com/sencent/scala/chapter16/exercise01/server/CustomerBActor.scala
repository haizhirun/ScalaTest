package com.sencent.scala.chapter16.exercise01.server

import akka.actor.{Actor, ActorRef, ActorSelection, ActorSystem, Props}
import com.sencent.scala.chapter16.exercise01.common.{CustomerAMessage, CustomerBMessage}
import com.typesafe.config.ConfigFactory

import scala.io.StdIn

class CustomerBActor extends Actor{

  var customerAactorRef : ActorSelection= _
  override def preStart(): Unit = {
    customerAactorRef = context.actorSelection("akka.tcp://CustomerA@127.0.0.1:9001/user/CustomerAActor")
  }
  override def receive: Receive = {
    case "start" =>{
      println("started...")
    }
    case CustomerAMessage(mesA) =>{
      println(mesA)
//      val mesB: String = StdIn.readLine()
//      customerAactorRef ! CustomerBMessage(mesB)
    }
    case mes:String =>{
      customerAactorRef ! CustomerBMessage(mes)
    }
  }
}


object CustomerBActor{
  def main(args: Array[String]): Unit = {

    val customerBIp = "127.0.0.1"
    val customerBPort = 9000


    val config = ConfigFactory.parseString(
      s"""
         |akka.actor.provider="akka.remote.RemoteActorRefProvider"
         |akka.remote.netty.tcp.hostname=$customerBIp
         |akka.remote.netty.tcp.port=$customerBPort
       """.stripMargin)

    val customerB: ActorSystem = ActorSystem("CustomerB",config)
    val customerBActorRef: ActorRef = customerB.actorOf(Props[CustomerBActor],"CustomerBActor")

    customerBActorRef ! "start"

    Thread.sleep(2000)
    while(true){
//      print("CustomerB说：")
      val mesB: String = StdIn.readLine()
      customerBActorRef ! "CustomerB说：" + mesB

    }

  }
}