package com.sencent.scala.chapter10

object Tuple01 {
  def main(args: Array[String]): Unit = {
    val t1 = (1,"a",2.2)
    println(t1._1)
    println(t1.productElement(0))
    //遍历元祖
    for(elem <- t1.productIterator){
      println(elem)
    }

  }
}
