package com.sencent.scala.chapter06.method

import scala.io.StdIn

object MethodDemo04 {
  def main(args: Array[String]): Unit = {
    println("请输入一个数：")
    val n: Int = StdIn.readInt()
    println(s"输入的数${n}是"+isOddOrEven(n))
  }

  def isOddOrEven(n:Int):String ={
       if(n%2==0) {
         "偶数"
       }else{
         "奇数"
       }

  }
}
