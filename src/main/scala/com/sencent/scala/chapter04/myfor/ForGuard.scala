package com.sencent.scala.chapter04.myfor

object ForGuard {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 3 if i != 2){
      println(i + " ")
    }
  }
}
