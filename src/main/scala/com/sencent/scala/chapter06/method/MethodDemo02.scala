package com.sencent.scala.chapter06.method

object MethodDemo02 {
  def main(args: Array[String]): Unit = {
    val me = new MethodExec
//    me.printRectangle()
    me.printRectangle(10,8)
    me.length = 3.25
    me.width = 2.12

    println(me.calArea())

    println(me.calArea(3.2,1.5))

  }
}

class MethodExec{
  var width:Double = _
  var length:Double = _

  def printRectangle(): Unit ={
    for(i <- 1 to 10){
      for(j <- 1 to 8){
        print("*")
      }
      println()
    }
  }

  def printRectangle(m:Int,n:Int): Unit ={
    for(i <- 1 to m){
      for(j <- 1 to n){
        print("*")
      }
      println()
    }
  }

  def calArea(): Double ={
    var result:Double = width * length
    result.formatted("%.2f").toDouble

  }

  def calArea(len:Double ,width:Double): Double ={
    this.length = len
    this.width = width
    var result:Double =this.width * this.length
    result.formatted("%.2f").toDouble

  }
}