package com.sencent.scala.chapter07.myextends

object MethodOverride01 {
  def main(args: Array[String]): Unit = {
    val emp = new Emp100
    emp.printName()
  }
}

class Person100{
  var name:String = "tom"

  def printName(): Unit ={
    println("person100 "+this.name)
  }
  def sayHi(): Unit ={
    println("sayHi..")
  }
}


class Emp100 extends Person100{
  //此处需要显示使用override
  override def printName(): Unit = {
    println("Emp printName()"+name)
    super.printName()
    sayHi()
  }
}