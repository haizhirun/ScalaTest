package com.sencent.scala.chapter06.constructor

object ConDemo04 {
  def main(args: Array[String]): Unit = {
    val worker = new Worker("w1")
    worker.name
    val worker2 = new Worker2("w2")
    worker2.inName
    val worker3 = new Worker3("w3")
    worker3.inName
  }
}
//1. 如果 主构造器是 Worker(inName: String) ，那么 inName 就是一个局部变量
class Worker(inName:String){
  var name:String =  inName
}
//. 如果 主构造器是 Worker2(val inName: String) ，那么 inName 就是 Worker2 的一个 private 的只读
class Worker2(val inName:String){
  var name:String =  inName
}
// 如果 主构造器是 Worker3(var inName: String) ，那么 inName 就是 Worker3 的一个
class Worker3(var inName:String){
  var name:String =  inName
}