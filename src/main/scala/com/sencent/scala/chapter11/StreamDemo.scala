package com.sencent.scala.chapter11

object StreamDemo {
  //创建Stream
  def numsForm(n:BigInt):Stream[BigInt]= n#::numsForm(n+1)
  def main(args: Array[String]): Unit = {
    val stream1: Stream[BigInt] = numsForm(1)
    println(stream1)
    println(stream1.head)
    println(stream1.tail)

    println(stream1)
  }
}
