package com.sencent.scala.chapter11

object ReduceDemo01 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5)
    val res: Int = list.reduceLeft(f1)
    println(res)
  }

  def f1(n1:Int,n2:Int)={
    println("f1被调用了...")
    n1 + n2
  }
}
