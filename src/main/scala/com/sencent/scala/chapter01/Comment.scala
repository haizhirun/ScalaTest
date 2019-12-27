package com.sencent.scala.chapter01

object Comment {

  def main(args: Array[String]): Unit = {
    println("hello world!")
    println(sum(1, 2))
  }

  /**
    *
    * @param num1 加数
    * @param num2 被加数
    * @return 和
    */
  def sum(num1: Int, num2: Int): Int = {
    num1 + num2
  }

}
