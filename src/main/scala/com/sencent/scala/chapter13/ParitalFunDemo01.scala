package com.sencent.scala.chapter13

object ParitalFunDemo01 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,"abc")
    val list2 = list.filter(f1).map(f2)
    println(list2)

    val list3 = list.map(add).filter(_.!=())
    println(list3)
  }

  def f1(s:Any)={
    s.isInstanceOf[Int]
  }

  def f2(num:Any)={
    num.asInstanceOf[Int] + 1
  }

  //使用模式匹配解决
  def add(i : Any)={
    i match {
      case x:Int => x+1
      case _ =>
    }
  }

}
