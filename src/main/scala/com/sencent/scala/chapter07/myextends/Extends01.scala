package com.sencent.scala.chapter07.myextends

object Extends01 {
  def main(args: Array[String]): Unit = {
    val s = new Student("kaisheng",22,10000.0)
    s.showInfo()
  }
}

class Person{
  var name:String = _
  var age:Int = _
  def this(name:String,age:Int){
    this()
    this.name = name
    this.age = age
  }
  def showInfo(): Unit ={
    println("person信息：name:"+this.name + " age:"+this.age)
  }
}

class Student extends Person{
  var score:Double = _

  def this(name:String,age:Int,score:Double){
    this()
    this.name = name
    this.age = age
    this.score = score
  }
  def studying(): Unit ={
    println(this.name+" is studying...")
  }

  override def showInfo(): Unit = {
    println(this.name + this.age + this.score)
  }
}
