package com.sencent.scala.chapter06.oop

object MemState {
  def main(args: Array[String]): Unit = {
    val p = new Person2
    p.name = "kaisheneg"
    p.age = 10

    println(s"${p.name}   ${p.age}")

    val p2 = p
    p2.name = "chang"
    println(p == p2)
    println(s"${p.name}   ${p.age}")

  }
}

class Person2{
  var name:String = _
  var age:Int = _
}
