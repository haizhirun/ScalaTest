package com.sencent.scala.chapter08

object AccompanyObject {
  def main(args: Array[String]): Unit = {
    println(ScalaPerson.sex)
    ScalaPerson.sayHi()
  }
}
//伴生类:存放非静态内容
class ScalaPerson{
  var name:String = _
}

//伴生对象：存放静态内容
object ScalaPerson{
  var sex:Boolean = true

  def sayHi(): Unit ={
    println("object Scala")
  }
}