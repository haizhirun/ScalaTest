package com.sencent.scala.chapter02

object TypeDemo01 {

  def main(args: Array[String]): Unit = {
    var num1 : Int = 10
    //在scala中，如果一个方法，没有形参，则可以省略()
    println(num1.toDouble + "\t" + num1.toString + "\t" + 100.toDouble)
    var isPass = true
    println(isPass.toString)

    hi
    hi
  }

  def hi(): Unit ={
    println("hi...")
  }

}
