package com.sencent.scala.chapter11

object FlatMapDemo01 {
  def main(args: Array[String]): Unit = {
    val myList = MyList2()
    val list: List[Char] = myList.flatMap(toUpper)
    println(list)

  }
  def toUpper(str: String)={
    str.toUpperCase()
  }
}

class MyList2{
  val list = List("aaa","bbb","ccc")
  var list2 = List[Char]()

  def flatMap(f:String => String)={
    for (elem <- list) {
        val str = f(elem)
        for(char <- str){
          list2 = list2 :+ char
        }
    }
    list2
  }
}

object MyList2{
  def apply(): MyList2 = new MyList2()
}
