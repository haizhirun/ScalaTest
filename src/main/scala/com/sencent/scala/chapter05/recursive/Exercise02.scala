package com.sencent.scala.chapter05.recursive

import scala.io.StdIn

object Exercise02 {
  def main(args: Array[String]): Unit = {
    val n: Int = StdIn.readInt()
    println(getFunRes(n))
  }

  /**
    * 求函数值  f(1)=3,f(n)=2*f(n-1)+1
    * @param n 输入的数
    * @return
    */
  def getFunRes(n:Int): Long ={
    if(n == 1){
      3
    }else{
      2 * getFunRes(n-1) + 1
    }

  }

}
