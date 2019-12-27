package com.sencent.scala.chapter04.ifelse

import scala.io.StdIn

object Demo04 {
  def main(args: Array[String]): Unit = {
    //计算ax^2 + bx + c = 0 的根
    val a = StdIn.readDouble()
    val b = StdIn.readDouble()
    val c = StdIn.readDouble()

    val temp = math.pow(b,2) - 4 * a * c
    if(temp < 0){
      println("方程无解")
    }else if(0 == temp){
      val res = -b /(2 * a)
      println("方程有唯一解: x = " + res)
    }else{
      val res : Array[Double] = new Array[Double](2)
      res(0) = (-b + math.sqrt(temp))/(2 * a)
      res(1) = (-b - math.sqrt(temp))/(2 * a)
      println("方程有两个不同解: x1 = " + res(0) + "\t" + "x2 = " + res(1))
    }

  }

}
