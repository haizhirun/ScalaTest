package com.sencent.scala.chapter04.ifelse

import scala.io.StdIn

object Demo05 {
  def main(args: Array[String]): Unit = {
    var sumVar = 9
    val result = if (sumVar > 2) {
      "结果大于20"
    }
    println("result = " + result)

    println("请输入成绩:")
    val score = StdIn.readDouble()
    if (score <= 8) {
      println("请输入性别：")
      val sex = StdIn.readLine()
      if ("男".equals(sex)) {
        println("进入男子组")
      } else {
        println("进入女子组")
      }
    } else {
      println("淘汰")
    }
  }
}
