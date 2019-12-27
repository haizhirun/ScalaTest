package com.sencent.scala.chapter06.oop

object CatDemo {
  def main(args: Array[String]): Unit = {
    val cat = new Cat
    cat.name = "小白"
    cat.age = 10
    cat.color = "白色"
    println(s"${cat.name} ${cat.age} ${cat.color}")
  }
}

/**
  * 定义一个Cat类
  */
class Cat{
  var name:String = ""
  var age:Int = _
  var color:String = _
}

