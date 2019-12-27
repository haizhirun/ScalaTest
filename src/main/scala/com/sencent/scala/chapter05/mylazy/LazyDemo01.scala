package com.sencent.scala.chapter05.mylazy

object LazyDemo01 {
  def main(args: Array[String]): Unit = {
    lazy val result = sum(10,20)
    println("------------------")
    println(result)
  }

  def sum(n1:Int,n2:Int): Int ={
    println("sum")
    n1+n2
  }
}
