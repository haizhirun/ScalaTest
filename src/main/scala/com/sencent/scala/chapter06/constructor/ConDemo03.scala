package com.sencent.scala.chapter06.constructor

object ConDemo03 {
  def main(args: Array[String]): Unit = {
    val p = new Person2()
    p.showInfo
    val p2 = new Person2("gui",22)
    p2.showInfo
    val p3 = new Person2("gui")
    p3.showInfo
    val p4 = new Person2(10)
    p4.showInfo
  }
}

class Person2(){
  var name:String = _
  var age : Int = _

  def this(name:String){
    this()
    this.name = name
  }
  def this(name:String,age:Int){
    this(name)
    this.age = age
  }
  def this(age:Int){
    this("test")
    this.age = age
  }

  def showInfo: Unit ={
    println("Person2的信息如下：")
    println(this.name + "\t" + this.age)
  }

}
