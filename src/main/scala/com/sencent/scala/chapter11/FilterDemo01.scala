package com.sencent.scala.chapter11

object FilterDemo01 {
  def main(args: Array[String]): Unit = {
//    val names = List("Alice","Bob","Nick")
//    val newNames: List[String] = names.filter(startWithA)
//    println(newNames)
    val mylist = MyList3()
    val myList2 = mylist.filter(startWithA)

    println(myList2)

  }
  def startWithA(str:String) ={
    str.startsWith("A")
  }
}

class MyList3{
  val list = List("Alice","Bob","Nick")
  var list2 = List[String]()

  def filter(f : String => Boolean)={
    for (elem <- list) {
      if(f(elem)){
        list2 = list2 :+ elem
      }
    }
    list2
  }
}

object MyList3{
  def apply(): MyList3 = new MyList3()
}

