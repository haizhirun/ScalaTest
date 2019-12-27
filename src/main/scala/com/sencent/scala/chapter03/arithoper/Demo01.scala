package com.sencent.scala.chapter03.arithoper

object Demo01 {
  def main(args: Array[String]): Unit = {
    var r1 : Int = 10/3
    println("r1="+r1)
    var r2 : Double = 10/3
    println("r2=" + r2)

    var r3 : Double = 10.0 / 3
    println(r3)
    printf("r3 = %.2f",r3)
    println(r3.formatted("%.2f"))

   //%的运算规则：a % b = a - a/b*b
    println(10 % 3)
    println(-10 % 3)//=-10 -(-10/3)*3 = -1
    println(-10 % -3)//=-10 -(-10/-3)*-3 = -1


    var num1 = 10//scala中没有num++
    num1 += 1
  }
}
