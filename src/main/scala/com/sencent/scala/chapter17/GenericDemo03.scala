package com.sencent.scala.chapter17

/**
  * 定义一个函数，可以获取各种类型的 List 的中间index的值
  */
object GenericDemo03 {
  def main(args: Array[String]): Unit = {
    val list1 = List("aaa","bbb","ccc")
    val list2 = List(1,2,3,4)
    println(getMidEle[String](list1))
    println(getMidEle(list2))
  }

  def getMidEle[A](list:List[A])={
    list(list.length/2)
  }
}


