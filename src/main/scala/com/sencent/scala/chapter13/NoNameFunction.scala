package com.sencent.scala.chapter13

object NoNameFunction {
  def main(args: Array[String]): Unit = {


    val f1 = (x1:Int,x2:Int)=>{
      x1 + x2
    }

    println(f1(10,20))
    println(f1)

    println(f2(f1, 10, 20))
  }

  def f2(f:(Int,Int)=>Int,n1:Int,n2:Int)={
    f(n1,n2)
  }


}
