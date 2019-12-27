package com.sencent.scala.chapter11

import scala.collection.immutable

object ParallelDemo02 {
  def main(args: Array[String]): Unit = {
    val result1: immutable.IndexedSeq[String] = (0 to 100).map {
      case _ => Thread.currentThread().getName
    }.distinct

    //查看并行集合中元素访问的线程
    val result2 = (0 to 100).par.map {
      case _ => Thread.currentThread().getName
    }.distinct

    println(result1)
    println(result2)
  }
}
