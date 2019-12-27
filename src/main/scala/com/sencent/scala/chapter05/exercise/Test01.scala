package com.sencent.scala.chapter05.exercise

object Test01 {
  def main(args: Array[String]): Unit = {
    printTower(6)

    println("==================")

    printN(9)
  }

  def printTower(n:Int): Unit ={
    for(i <- 1 to n){
      var j = 2*i -1
      for(x <- 1 to 6-i){
        print(" ")
      }
      for (y <-1 to j){
        print("*")
      }
      println()
    }
  }

  def printN(n:Int): Unit ={
    for (i <- 1 to 9){
      for(j <- 1 to i){
        print(s"$i * $j = ${i * j}"+"\t")
      }
      println()
    }
  }
}
