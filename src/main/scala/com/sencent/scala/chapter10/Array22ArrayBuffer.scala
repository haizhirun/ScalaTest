package com.sencent.scala.chapter10

import scala.collection.mutable.ArrayBuffer

object Array22ArrayBuffer {
  def main(args: Array[String]): Unit = {
    val arr2 = ArrayBuffer[Int]()
    arr2.append(1,2,3)
    println(arr2.hashCode())

    val newArr = arr2.toArray
    println(newArr.hashCode())
    println(arr2.hashCode())

    val newArr2 = newArr.toBuffer
    newArr2.append(123)
    println(newArr2)
  }
}
