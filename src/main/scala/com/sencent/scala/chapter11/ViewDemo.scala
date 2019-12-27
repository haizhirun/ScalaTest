package com.sencent.scala.chapter11

import scala.collection.{SeqView, immutable}

object ViewDemo {
  var j = 0
  def main(args: Array[String]): Unit = {
    var list = (1L to 99999)
//    val filterList = list.filter(eq)
//    println(filterList)

    //使用view,进行懒加载
    val filterList2 = (1L to 99999).view.filter(eq)
    println(filterList2(0))
    println("j="+j)
  }

  def eq(i:Long)={
    //j用于统计比较了多少数
    j += 1
    i.toString().equals(i.toString().reverse)

  }


}
