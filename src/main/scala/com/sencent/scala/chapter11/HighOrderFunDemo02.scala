package com.sencent.scala.chapter11

object HighOrderFunDemo02 {
  def main(args: Array[String]): Unit = {
    test2(say)
  }

  def test2(f:()=>Unit)={
    f()
  }
  def say()={
    println("say...")
  }

}
