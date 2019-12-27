package com.sencent.scala.chapter03.assignoper

object Demo01 {
  def main(args: Array[String]): Unit = {
    var num = 2
    num <<= 2
    println(num)
    num >>= 3
    println(num)

    //代码块赋值
    val res = {
      if(num > 1)
        "test"
      else
        100
    }
    println("res = " + res)

    var a = 10
    var b = 20
    //交换a,b
    a = a + b
    b = a -b
    a = a -b
    println("a = " + a + "\t" + "b = " + b)

    //位运算
    a = 10
    b = 20
    a = a ^ b
    b = a ^ b //b = a
    a = a ^ b //a = b
    println("a = " + a + "\t" + "b = " + b)






  }
}
