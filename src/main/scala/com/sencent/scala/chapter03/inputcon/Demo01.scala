package com.sencent.scala.chapter03.inputcon

import scala.io.StdIn

object Demo01 {
  def main(args: Array[String]): Unit = {
    /*
    输出从控制台接收到的用户信息，【姓名，年龄，薪水】
     */
    println("请输入姓名")
    val name = StdIn.readLine()
    println("请输入年龄")
    val age = StdIn.readInt()
    println("请输入薪水")
    val sal = StdIn.readDouble()
    println(s"姓名:$name 年龄:$age 薪水$sal")

    Cat.sayHi()
    Cat.sayHello()
  }
}

object Cat extends AAA{
  def sayHi(): Unit ={
    println("Cat...")

  }
}

trait AAA{
  def sayHello(): Unit ={
    println("AAA sayHello")
  }
}
