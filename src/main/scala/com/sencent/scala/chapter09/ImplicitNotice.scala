package com.sencent.scala.chapter09

object ImplicitNotice {
  def main(args: Array[String]): Unit = {
    implicit def f1(d:Double): Int ={
      d.toInt
//      val num2:Int = 2.2//隐式转换不能嵌套使用 f1$1(2.3) //f1$1 对应的就是 f1,就会形成递归
    }

    val num1:Int = 1.1
  }
}
