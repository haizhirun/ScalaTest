package com.sencent.scala.chapter05.fundetails

object Details04 {
  def main(args: Array[String]): Unit = {
    println(sayOk("kaisheng"))
  }

  def sayOk(name:String="jack"): String ={
    return "hello " + name
  }
}
