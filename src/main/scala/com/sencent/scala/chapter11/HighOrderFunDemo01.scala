package com.sencent.scala.chapter11

object HighOrderFunDemo01 {
  def main(args: Array[String]): Unit = {
    val fun1 = myPrint _
    fun1()
    val result: Double = test(f,2.0)
    println(result)
  }

  def myPrint(): Unit ={
    println("myPrint...")
  }

  def test(f : Double => Double,n1: Double) ={
    f(n1)
  }

  def f(n1 : Double)={
    println("f...")
    n1 * 3
  }
}
