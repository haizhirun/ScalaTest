package com.sencent.scala.chapter11

object MapOperateTherory {
  def main(args: Array[String]): Unit = {
    val myList = MyList()
    val myList2 = myList.map(f)
    for (elem <- myList2) {
      println(elem)
    }
  }

  def f(n:Int): Int ={
    n * 2
  }
}

class MyList{
  val list1 = List(3,5,7)
  var list2 = List[Int]()

  def map(f:Int => Int)= {
    for(i <- list1){
      list2 = list2 :+ f(i)
    }
    list2
  }
}

object MyList{
  def apply(): MyList = new MyList()
}
