package com.sencent.scala.chapter11

import scala.io.StdIn

object TestHighOrderDef {
  def main(args: Array[String]): Unit = {
    println("请输入一个整数：")
    val input: Int = StdIn.readInt()
    val res = test(squrare,input)
    println(s"${input}的平方为"+res)

    test2(sayOk)
  }

  def test(f:Int => Int, n : Int ): Int ={
    f(n)
  }
  def squrare(n : Int)={
    n * n
  }

  def test2(f:() => Unit): Unit ={
    f()
  }

  def sayOk(): Unit ={
    println("测试高阶函数...")
  }
}
