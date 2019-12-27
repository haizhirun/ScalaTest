package com.sencent.scala.chapter05.recursive

import scala.io.StdIn

object Exercise01 {
  def main(args: Array[String]): Unit = {
    println("请输入一个整数n:")
    val n: Int = StdIn.readInt()
    printf("该正整数%d对应的斐波拉契数为%d",n,getFib(n))

  }

  /**
    * @param n  输入一个整数
    * @return   该整数对应的斐波拉契数
    */
  def getFib(n: Int): Long ={
    if(n == 1 || n == 2){
      1
    }else{
      getFib(n-2) + getFib(n-1)
    }
  }

}
