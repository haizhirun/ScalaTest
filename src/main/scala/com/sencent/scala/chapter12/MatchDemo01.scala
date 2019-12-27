package com.sencent.scala.chapter12

object MatchDemo01 {
  def main(args: Array[String]): Unit = {
    val oper = '-'
    val num1 = 10
    val num2 = 20
    var res = 0

    oper match {
      case '+' =>{
        res = num1 + num2
      }
      case '-' => {
        res = num1 - num2
      }
      case '*' =>{
        res = num1 * num2
      }
      case '/' =>{
        res = num1 / num2
      }
      case _ =>{
        println("输入有误")
      }
    }
    println("res="+res)
  }
}
