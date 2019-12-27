package com.sencent.scala.chapter03.notice

object Demo01 {
  def main(args: Array[String]): Unit = {
//    val num = 5 > 4 ? 5 : 4//scala中没有三目运算符，通过if else实现
    val num = if( 5 > 4) 5 else 4
    println(num)
  }
}
