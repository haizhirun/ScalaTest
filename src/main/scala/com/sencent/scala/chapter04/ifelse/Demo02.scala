package com.sencent.scala.chapter04.ifelse

import scala.io.StdIn

object Demo02 {
  def main(args: Array[String]): Unit = {
    val num1 = 10
    val num2 = 20
    val sum = num1 + num2

    if(sum % 3 == 0 && sum % 5 == 0){
      println(sum + "既能被3整除也能被5整除")
    }else{
      println(sum + "不能同时被3整除也能被5整除")
    }

    println("请输入年份")
    val year = StdIn.readInt()

    if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
      println(year + "是闰年")
    }else{
      println(year + "不是闰年")
    }
  }
}
