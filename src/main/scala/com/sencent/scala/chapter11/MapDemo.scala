package com.sencent.scala.chapter11

object MapDemo {
  def main(args: Array[String]): Unit = {
    val list = List(1,3,5)
    val list2 = list.map(f1)
    println(list2)
    //方法转成函数,注意f1后面加空格
    val f2 = f1 _
    println(f2)
    println(f2(10))

    val f3 = (n1:Int,n2:Int)=>{
      n1 + n2
    }
    println(f3)
    println(f3(1, 2))
  }

  def f1(n:Int)={
    n * 2
  }
}
