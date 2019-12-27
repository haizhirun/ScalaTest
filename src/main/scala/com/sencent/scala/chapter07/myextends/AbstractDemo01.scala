package com.sencent.scala.chapter07.myextends

object AbstractDemo01 {
  def main(args: Array[String]): Unit = {
    println("------")
    val animal = new Animal {
      override var name: String = "tiger"
      override var age: Int = 2

      override def cry(): Unit = {
          println(s"${age}岁的${name} 哭了...")
      }
    }

    animal.cry()
    animal.sayHi()
  }
}

abstract class Animal{
  var name:String//抽象字段
  var age:Int
  var color:String="black"//普通属性
  def cry()//抽象方法

  //在抽象类中可以有实现的方法
  def sayHi (): Unit = {
    println("xxx")
  }
}
