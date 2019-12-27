package com.sencent.scala.chapter12

import scala.collection.mutable.ArrayBuffer

object ArrayMatch {
  def main(args: Array[String]): Unit = {
    val arrs = Array(Array(0),Array(1,0),Array(0,1,0),Array(1,1,0),Array(1,1,0,1))
    for(arr <- arrs){
      val result = arr match {
        case Array(0) => "0"
        case Array(x,y) =>ArrayBuffer(y,x)
        case Array(0,_*) =>"以0开头的数组"
        case _ => "None"
      }
      println("result = " + result)
    }
  }
}
