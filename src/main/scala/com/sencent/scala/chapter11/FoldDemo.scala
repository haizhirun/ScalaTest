package com.sencent.scala.chapter11

object FoldDemo {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5)
    var res1 = (1/:list)(minus) // 等价于list.foldLeft(1)(minus)
    println(res1)
    var res2 = (list:\1)(minus) //等价于list.foldRight(1)(minus)
    println(res2)
  }
  def minus(n1:Int,n2:Int)={
    n1 - n2
  }
}
