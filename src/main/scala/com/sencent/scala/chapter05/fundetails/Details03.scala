package com.sencent.scala.chapter05.fundetails

/**
  * Scala 语法中任何的语法结构都可以嵌套其他语法结构(灵活)，即：函数中可以再声明/定义函数，
  * 类中可以再声明类 ，方法中可以再声明/定义方法
  */
object Details03 {
  def main(args: Array[String]): Unit = {
    def f1(): Unit ={
      println("f1")
    }
    println("ok")
    f1()
    Details03.sayOk()
    sayOk()

    def sayOk(): Unit ={
      println("out sayOk")
      sayOk()
      def sayOk(): Unit ={
        println("in sayOk")
      }
    }
  }

  def sayOk(): Unit ={
    println("成员 sayOk")
  }

}
