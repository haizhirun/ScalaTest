package com.sencent.scala.chapter10

object ArrayDemo01 {
  def main(args: Array[String]): Unit = {
    val arr01 = new Array[Int](5)
    arr01(0) = 1
    for (elem <- arr01) {
      println(elem)
    }
  }
}
