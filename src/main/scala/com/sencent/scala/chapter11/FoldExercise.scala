package com.sencent.scala.chapter11

import scala.collection.mutable.ArrayBuffer

object FoldExercise {
  def main(args: Array[String]): Unit = {
    val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
    var arr = ArrayBuffer[Char]()
    sentence.foldLeft(arr)(putChar)
    println(arr)
  }
  def putChar(arr:ArrayBuffer[Char],ch : Char)={
    arr.append(ch)
    arr
  }
}
