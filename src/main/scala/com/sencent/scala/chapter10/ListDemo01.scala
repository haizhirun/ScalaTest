package com.sencent.scala.chapter10

object ListDemo01 {
  def main(args: Array[String]): Unit = {
    val list01 = List(1,2,3)
    println(list01)
    val list02 = Nil
    println(list02)

    val list1 = List(1,2,3,"abc")
    val list2: List[Any] = list1 :+ 4
    println(list1)
    println(list2)

    val list3: List[Any] = 10 +:list1
    println(list3)

    val list4 = List(1,2,3,"abc")

//    1) 符号::表示向集合中 新建集合添加元素。
//    2) 运算时， 集合对象一定要放置在最右边，
//    3) 运算规则，从右向左。
//    4) :::  运算符是将集合中的每一个元素加入到集合中去
    val list5 = 4::5::6::list4::Nil
    println(list5)

    val list6 = 4::5::6::list4:::Nil
    println(list6)


  }
}
