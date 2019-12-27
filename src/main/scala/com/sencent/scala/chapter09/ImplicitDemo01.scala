package com.sencent.scala.chapter09

object ImplicitDemo01 {
  def main(args: Array[String]): Unit = {
    //1.隐式转换函数的函数名可以是任意的，隐士转换与函数名无关，
    //，只与函数签名有关
    //2.隐士函数可以有多个，但是需要保证在当前环境下，只有一个生效
    //编写一个隐士函数
    implicit def f1(d:Double): Int ={
      d.toInt
    }

    implicit def f2(f1:Float): Int ={
      f1.toInt
    }
//    implicit def f3(f3:Float): Int ={
//      f3.toInt
//    }
    val num:Int = 3.5f
    println(num)

  }


}
