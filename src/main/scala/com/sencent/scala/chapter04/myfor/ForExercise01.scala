package com.sencent.scala.chapter04.myfor

object ForExercise01 {
  def main(args: Array[String]): Unit = {
    //打印1~100之间所有是9的倍数的整数的个数及总和
    var count = 0
    var sum = 0
    for(i <- 1 to 100 if isMultipleOf9(i)){
      println(i)
        count+=1
        sum +=i
    }
    println("9的倍数的整数的个数有：" + count)
    println("9的倍数的整数的总和为：" + sum)
  }

 def isMultipleOf9(num : Int): Boolean ={
   num % 9 == 0
 }
}
