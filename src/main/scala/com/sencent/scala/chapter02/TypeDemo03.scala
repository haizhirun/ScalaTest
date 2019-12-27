package com.sencent.scala.chapter02

object TypeDemo03 {

  def main(args: Array[String]): Unit = {
    println("long的最大值" + Long.MaxValue + "\t" + "Long的最小值" + Long.MinValue)

    var i = 10 //i Int
    var j = 10l //j Long
    var e = 9223372036854775807L
    println(e)

    var num1 : Float = 2.2345678912f
    var num2 : Double = 2.2345678912

    println("num1=" + num1 + "num2=" + num2)




  }

}
