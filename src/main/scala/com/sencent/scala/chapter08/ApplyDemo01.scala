package com.sencent.scala.chapter08

object ApplyDemo01 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,"kai")
    for (elem <- list) {
      println(elem)
    }
    val pig2 = Pig("test")
    val pig3 = Pig()

    println("pig2.name=" + pig2.name) //小黑猪
    println("pig3.name=" + pig3.name) //匿名猪猪
  }
}

class Pig(pName:String){
  var name:String = pName
}

object Pig{
  def apply(pName:String): Pig ={
    return new Pig(pName)
  }

  def apply(): Pig = new Pig("匿名")
}