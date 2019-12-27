package com.sencent.scala.chapter04.ifelse

import scala.io.StdIn

object Demo06 {
  def main(args: Array[String]): Unit = {
    println("请输入月份")
    val month: Int = StdIn.readInt()
    println("请输入年龄")
    val age = StdIn.readInt()

    //判断淡季还是旺季
    val price = if(month >= 4 && month <= 10){
      val fullprice = 60
      if(age > 60){
        fullprice * 1/3
      }else if(age > 18){
        fullprice
      }else{
        fullprice * 1/2
      }

    }else{
      if(age >= 18 && age <= 60){
        40
      }else{
        20
      }
    }
    println("您的票价为：" + price)




  }
}
