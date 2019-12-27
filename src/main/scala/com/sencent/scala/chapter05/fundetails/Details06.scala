package com.sencent.scala.chapter05.fundetails

object Details06 {
  def main(args: Array[String]): Unit = {
    println(sum(10,20,30,40,50))
    println(f)
    def f = "test"
//    等价于
//    def f() ={
//      "test"
//    }
  }

  def sum(n1:Int,args:Int*): Int ={
    var sum = n1
    for (elem <- args) {
      sum+=elem
    }
    sum
  }

//  def sum2(args:Int*,n :Int): Unit ={
//
//  }
}
