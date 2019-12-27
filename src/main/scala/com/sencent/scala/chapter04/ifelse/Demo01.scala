package com.sencent.scala.chapter04.ifelse

object Demo01 {
  def main(args: Array[String]): Unit = {
    var x = 4
    var y = 1
    if(x > 2){
      if(y > 2){
        println(x+y)
      }
      println("guikaisheng")
    }else{
      println("x = " + x)
    }
  }
}
