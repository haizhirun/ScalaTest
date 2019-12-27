package com.sencent.scala.chapter11

object MapExercise01 {
  def main(args: Array[String]): Unit = {
    val names = List("Alice","Bob","Nick")
    val newNames: List[String] = names.map(upper)
    println(newNames)
  }
  def upper(str:String)={
    str.toUpperCase()
  }
}
