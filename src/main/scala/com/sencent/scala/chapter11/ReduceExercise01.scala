package com.sencent.scala.chapter11

object ReduceExercise01 {
  def main(args: Array[String]): Unit = {
    //求出集合的最小值
    val list = List(1,2,3,4,5)
    val res: Int = list.reduceRight(min)
    println(res)
  }

  def min(n1:Int,n2:Int) ={
    if(n1 > n2){
      n1
    }else{
      n2
    }
  }

}
