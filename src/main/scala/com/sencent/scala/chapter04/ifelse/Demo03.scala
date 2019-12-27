package com.sencent.scala.chapter04.ifelse

import scala.io.StdIn

object Demo03 {
  def main(args: Array[String]): Unit = {
    println("请输入成绩")
    val score = StdIn.readDouble()
    if (score == 100){
      println("奖励一辆 BMW")
    }else if(score >80 && score <= 99){
      println("奖励一台 iphone7plus")
    }else if(score >= 60 && score <= 80){
      println("奖励一个 iPad")
    }else{
      println("什么奖励也没有")
    }

  }
}
