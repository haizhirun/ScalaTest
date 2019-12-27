package com.sencent.scala.chapter16

import akka.actor.Actor

class BActor extends Actor{
  var count = 0
  override def receive: Receive = {
    case "B出招" =>{
      count += 1
      println(s"B出招${count}次")
      Thread.sleep(1000)
      if(count >= 10) {
        sender() ! "exit"
      }else{
        sender() ! "A出招"
      }
    }
    case "exit" =>{
      context.stop(self)
      context.system.terminate()
    }
  }
}
