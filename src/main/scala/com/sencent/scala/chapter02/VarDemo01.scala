package com.sencent.scala.chapter02

object VarDemo01 {

  def main(args: Array[String]): Unit = {
    var age : Int = 10
    var name : String = "kaisheng"
    var sal : Double = 3000.0
    var isPass : Boolean = true

    var score : Float = 70.9f

    println(s"age = $age ,name = ${name} , sal = ${sal + 100} ,isPass = ${isPass}")

  }

}
