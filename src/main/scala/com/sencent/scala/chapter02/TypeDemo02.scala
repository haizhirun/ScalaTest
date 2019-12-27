package com.sencent.scala.chapter02

object TypeDemo02 {

  def main(args: Array[String]): Unit = {
      println(sayHello)
  }


  def sayHello: Nothing ={
    throw new Exception("抛出异常")
  }

}
