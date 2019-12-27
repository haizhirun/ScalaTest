package com.sencent.scala.chapter17.viewbounds

object ViewBoundsDemo {
  def main(args: Array[String]): Unit = {

    //比较一下视图界定的使用, 可以支持隐式转换
    //原来的方法
    val compareComm2 = new CompareComm(java.lang.Float.valueOf(1.1f), java.lang.Float.valueOf(1.3f))
    println(compareComm2.greater) // 1.3

    val compareComm3 = new CompareComm[java.lang.Float](11.1f, 10.3f)
    println(compareComm3.greater) // 11.1
    //这里会直接将 111.1 => java.lang.Float
    //在 scala 包有 一个 object Predef
    //implicit def float2Float(x: Float): java.lang.Float
    val compareComm4 = new CompareComm(111.1f, 109.7f)
    println(compareComm4.greater) // 111.1

  }

}
//说明
//1. T <% Comparable[T] 表示视图界定
//2. T 是 Comparable[T] 子类型, 同时也支持隐式转换.

class CompareComm[T <% Comparable[T]](obj1: T, obj2: T) {

  def greater = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}
