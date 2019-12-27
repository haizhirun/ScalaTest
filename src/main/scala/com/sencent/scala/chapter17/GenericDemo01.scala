package com.sencent.scala.chapter17

/**
  * 编写一个Message类，可以构建Int类型的Message,String
  * 类型的Message
  */
object GenericDemo01 {
  def main(args: Array[String]): Unit = {
    val intMessage = new IntMessage[Int](100)
    println(intMessage.get)
    val strMessage = new StrMessage[String]("hello")
    println(strMessage.get)
  }
}


abstract class Message[T](s:T){
  def get:T = s
}

//构建Int类型的Message
class IntMessage[Int](mes:Int) extends Message(mes)

////构建String类型的Message
class StrMessage[String](mes:String) extends Message(mes)