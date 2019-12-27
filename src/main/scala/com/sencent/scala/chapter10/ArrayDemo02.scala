package com.sencent.scala.chapter10

object ArrayDemo02 {
  def main(args: Array[String]): Unit = {
    var arr02 = Array(1,2,"test")
    arr02(1) = "hel"
    for (elem <- arr02) {
      println(elem)
    }

    for(i <- 0 until  arr02.length){
      printf("arr02[%d]=%s\n",i,arr02(i))
    }
  }
}
