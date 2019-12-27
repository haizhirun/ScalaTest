package com.sencent.scala.chapter10

import scala.collection.mutable.ArrayBuffer

object ArrayBufferDemo01 {
  def main(args: Array[String]): Unit = {
    val arr01 = ArrayBuffer[Any](3,2,5)//此处不能直接new ArrayBuffer[Any](3,2,5)

    for(i <- arr01){
      println(i)
    }
    println("arr01.hashCode="+arr01.hashCode())//arr01.hashCode=110266112
    arr01.append(10,20,30)
    println("arr01.hashCode="+arr01.hashCode())//arr01.hashCode=274822409
    for(i <- arr01){
      println(i)
    }
    println("=====删除后=====")
    arr01.remove(0)
    for(i <- arr01){
      println(i)
    }





  }
}
