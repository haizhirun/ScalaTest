package com.sencent.scala.chapter02.dataconvert

object Demo02 {
  def main(args: Array[String]): Unit = {
    val num1 : Int = 10 * 3.5.toInt + 6 * 1.5.toInt
    val num2 : Int = (10 * 3.5 + 6 * 1.5).toInt
    //num1 = 36	num2 = 44
    println("num1 = " + num1 + "\t" + "num2 = " + num2)

    val char1 : Char = 1
    val num3 = 1
    val char2 : Char = num3.toChar

    val d1 = 1.2
    val s1 = d1 + ""
    val s3 = "hello"
//    println(s3.toInt)//报错Exception in thread "main" java.lang.NumberFormatException: For input string: "hello"

    val s4 = "12.5"
//    println(s4.toInt)//Exception in thread "main" java.lang.NumberFormatException: For input string: "12.5"

    println(s4.toDouble)

  }
}
