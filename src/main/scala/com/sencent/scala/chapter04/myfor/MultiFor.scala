package com.sencent.scala.chapter04.myfor

object MultiFor {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3 ; j <- 1 to 3){
      println(s"i = $i j = $j")
    }
  }
}
