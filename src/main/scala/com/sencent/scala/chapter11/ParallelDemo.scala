package com.sencent.scala.chapter11

object ParallelDemo {
  def main(args: Array[String]): Unit = {
    //串行化执行
    val start: Long = System.currentTimeMillis()
    (1 to 1000).foreach(print)
    val end: Long = System.currentTimeMillis()
    println()
    println("串行化执行消耗时间为：" + (end - start) +"ms")

    val start2: Long = System.currentTimeMillis()
    (1 to 1000).par.foreach(print)
    val end2: Long = System.currentTimeMillis()
    println()
    println("并行化执行消耗时间为：" + (end2 - start2) +"ms")
  }

}
