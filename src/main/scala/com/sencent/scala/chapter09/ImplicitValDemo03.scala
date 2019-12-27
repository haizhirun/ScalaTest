package com.sencent.scala.chapter09

object ImplicitValDemo03 {
  def main(args: Array[String]): Unit = {
    implicit val str1:String = "test1"
    hello


  }
  def hello(implicit name:String): Unit ={
    println("hello"+name)
  }
}
