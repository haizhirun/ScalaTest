package com.sencent.scala.chapter02.dataconvert

object Demo01 {
  def main(args: Array[String]): Unit = {
    var n1 = 10
    var n2 = 1.1f
    var n3 = n1 + n2
    println(n3)
    val res: Int = n3.asInstanceOf[Int]
    println(res)

    var n4 : Byte = 10
    var n5 : Short = 90
    var n6 : Char = 'a'
//    var char1 : Char = n4//(byte,short)和char之间不能相互自动转换，在计算时可以先转换为Int
//    var char2 : Char = n5
//    var byte1 : Byte = n6  //运行时异常
//    var short1 : Short = n6//运行时异常

  }
}
