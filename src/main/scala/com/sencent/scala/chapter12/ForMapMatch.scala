package com.sencent.scala.chapter12

object ForMapMatch {
  def main(args: Array[String]): Unit = {
    val map = Map("A"->1,"B"->2,"C"->3)
    for((k,v) <- map){
      println(k + "->" + v)
    }

    for((k,2) <- map){
      println(k + "->" + "0")
    }

    for((k,v) <- map if v>1){
      println(k + "->" + v)
    }
  }
}
