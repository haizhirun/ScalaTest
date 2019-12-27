package com.sencent.scala.chapter07.myextends

object Extends02 {
  def main(args: Array[String]): Unit = {
    val sub = new Sub()
    sub.sayOk()
  }
}

class Base{
  var n1:Int = 1
  protected var n2:Int = 2
  private var n3:Int = 3

  def test100(): Unit ={
    println("base100")
  }
  protected def test200(): Unit ={
    println("base200")
  }

  private def test300(): Unit ={
    println("base300")
  }

}


class Sub extends Base{
  def sayOk(): Unit ={
    this.n1 = 20
    this.n2 = 40
//    this.n3//访问不到

    println("范围："+this.n1 + this.n2)
    test100()
    test200()
//    test300()//访问不到
  }
}