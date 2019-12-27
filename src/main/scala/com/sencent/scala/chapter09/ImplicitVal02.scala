package com.sencent.scala.chapter09

/**
  * 1.当在程序中，同时有隐式值，默认值，传值
  * 2.编译器的优先级为：传值>隐式值>默认值
  * 3.在隐式值匹配时，不能有二义性
  * 4.如果三个（隐式值，默认值，传值）一个都没有就会报错
  */
object ImplicitVal02 {
  def main(args: Array[String]): Unit = {
    implicit val name:String = "scala"
    def hello(implicit content:String = "jack"): Unit ={
      println("hello "+ content)
    }
    hello("gui")

    def test(implicit content:String): Unit ={
      println("hello " + content)
    }

    test
//
//    def hello2(implicit content:String="tom"): Unit ={
//      println("hello2 "+content)
//    }
//    hello2
//
//    implicit val name:Int = 10
//    def hello3(implicit content:String="jack"): Unit ={
//      println("hello3 "+content)
//    }
//    hello3
//
//    def hello4(implicit content:String): Unit ={
//      println("hello4 "+content)
//    }
//    hello4//报错
  }
}
