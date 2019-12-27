package com.sencent.scala.chapter04.myfor

object ForDemo01 {
  def main(args: Array[String]): Unit = {
    val start = 1
    val end = 10
    //前后闭
    for(i <- start to end){
      println(i)
    }

    var list = List("hello",10,20,"tom")
    for (elem <- list) {
      println(elem)
    }

    for (i <- start until end){
      println(i)
    }

  }
}
