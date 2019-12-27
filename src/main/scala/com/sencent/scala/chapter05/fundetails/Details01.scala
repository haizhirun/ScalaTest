package com.sencent.scala.chapter05.fundetails

object Details01 {
  def main(args: Array[String]): Unit = {
    val tiger = new Tiger
    val tiger2 = test(tiger)
    println(tiger.name +"---------"+ tiger2.name)
    println(tiger.hashCode() +"  "+ tiger2.hashCode())
  }

  def test(tiger:Tiger): Tiger ={
    tiger.name = "jack"
    tiger
  }
}

class Tiger{
  var name = ""
}
