package com.sencent.scala.chapter02

object VarDemo02 {

  def main(args: Array[String]): Unit = {
    val num = 10
    println(num.isInstanceOf[Int])
    var dog = new Dog
    dog.age = 10
    dog = new Dog
  }


  class Dog{
    var age : Int = 0
    var name : String = ""
  }

}
