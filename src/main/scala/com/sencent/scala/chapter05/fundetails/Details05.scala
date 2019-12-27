package com.sencent.scala.chapter05.fundetails

object Details05 {
  def main(args: Array[String]): Unit = {
    mysqlCon()
    mysqlCon("hadoop102",50070)
    mysqlCon(user="kaisheng",pwd="123456")
    f6("v2","v3")
//    f6("v2")//报错
    f6(p2="p2")
  }

  def mysqlCon(address:String="localhost",port:Int=3306,user:String="root",pwd:String="root"): Unit ={
    println("address="+address)
    println("port="+port)
    println("user="+user)
    println("pwd="+pwd)
  }

  def f6(p1:String="v1",p2:String): Unit ={
    println(p1 + p2)
  }
}
