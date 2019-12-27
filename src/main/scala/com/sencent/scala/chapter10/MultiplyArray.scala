package com.sencent.scala.chapter10

object MultiplyArray {
  def main(args: Array[String]): Unit = {
    val arr: Array[Array[Double]] = Array.ofDim[Double](3,4)

    //遍历二维数组中的每个元素
    for(i<-arr){
      for(j <- i){
        print(j + "\t")
      }
      println()
    }

    println(arr(0)(0))
    arr(0)(0) = 100
    for(i<-arr){
      for(j <- i){
        print(j + "\t")
      }
      println()
    }


  }
}
