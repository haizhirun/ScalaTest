package com.sencent.scala.chapter16.server

import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import com.sencent.scala.chapter16.common.{ClientMessage, ServerMessage}
import com.typesafe.config.ConfigFactory

class YellowChickenServer extends Actor{
  override def receive: Receive = {
    case "start" => {
      println("服务端启动，可以咨询问题")
    }
    case ClientMessage(mes) =>{
      mes match {
        case "大数据" =>{
          sender() ! ServerMessage("大数据（big data）是指无法在一定时间范围内用常规软件工具进行捕捉、管理和处理的数据集合，是需要新处理模式才能具有更强的决策力、洞察发现力和流程优化能力的海量、高增长率和多样化的信息资产")
        }
        case "java" =>{
          sender() ! ServerMessage("Java是一门面向对象编程语言，不仅吸收了C++语言的各种优点，还摒弃了C++里难以理解的多继承、指针等概念，因此Java语言具有功能强大和简单易用两个特征")
        }
        case "python" =>{
          sender() ! ServerMessage("Python是一种跨平台的计算机程序设计语言。是一种面向对象的动态类型语言，最初被设计用于编写自动化脚本(shell)，随着版本的不断更新和语言新功能的添加，越来越多被用于独立的、大型项目的开发")
        }
        case "AI" =>{
          sender() ! ServerMessage("人工智能（Artificial Intelligence），英文缩写为AI。它是研究、开发用于模拟、延伸和扩展人的智能的理论、方法、技术及应用系统的一门新的技术科学。人工智能（Artificial Intelligence），英文缩写为AI。它是研究、开发用于模拟、延伸和扩展人的智能的理论、方法、技术及应用系统的一门新的技术科学。")
        }
        case _ =>{
          sender() ! ServerMessage("请再说一遍,不太理解您的意思...")
        }
      }
    }
    case _ => sender() ! ServerMessage("I don't know what you say...")
  }
}


object YellowChickenServer {
  def main(args: Array[String]): Unit = {
    //创建ActorSystem
    //因为这时，我们需要监听网络，所以使用如下方法创建工厂
    //Config 就是我们的网络配置 ip , port..
    //def apply(name: String, config: Config): ActorSystem = apply(name, Option(config), None, None)

    val host = "127.0.0.1" //ip4
    val port = 9999
    //Config 就是我们的网络配置 ip , port..
    val config = ConfigFactory.parseString(
      s"""
         |akka.actor.provider="akka.remote.RemoteActorRefProvider"
         |akka.remote.netty.tcp.hostname=$host
         |akka.remote.netty.tcp.port=$port
       """.stripMargin)

    val serverActorSystem = ActorSystem("Server",config)

    val server: ActorRef = serverActorSystem.actorOf(Props[YellowChickenServer],"YellowChickenServer")

    //akka.tcp://Server@127.0.0.1:9999  就是Actor 路径

    server ! "start"




  }
}