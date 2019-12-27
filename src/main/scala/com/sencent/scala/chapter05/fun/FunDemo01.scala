package com.sencent.scala.chapter05.fun

object FunDemo01 {
  def main(args: Array[String]): Unit = {
    var n1 = 10
    var n2 = 20
    println(getRes(n1,n2,')'))
  }

  def getRes(n1:Int, n2:Int,oper:Char) ={
    if(oper == '+'){
      n1 + n2
    }else if (oper == '-'){
      n1 - n2
    }else{
      null
    }
  }

}
