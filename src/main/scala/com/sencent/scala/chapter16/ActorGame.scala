package com.sencent.scala.chapter16

import akka.actor.{ActorRef, ActorSystem, Props}

object ActorGame {
  def main(args: Array[String]): Unit = {
    val actorFactory =  ActorSystem("actorFactory")
    val bActorRef: ActorRef = actorFactory.actorOf(Props[BActor],"BActor")
    val aActorRef: ActorRef = actorFactory.actorOf(Props(new AActor(bActorRef)),"AActor")

    aActorRef ! "start"
  }
}
