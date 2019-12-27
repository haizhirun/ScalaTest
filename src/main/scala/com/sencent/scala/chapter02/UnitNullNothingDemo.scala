package com.sencent.scala.chapter02

object UnitNullNothingDemo {

  def main(args: Array[String]): Unit = {
    val res = sayHello()
    println("res="+res)

    //null可以赋给任意引用类型，不能赋值给值类型
    val dog:Dog = null

    //编译时不会出错，运行时会出错
   // val char1:Char = null



  }

  def sayHello(): Unit ={

  }
  class Dog{

  }

}
