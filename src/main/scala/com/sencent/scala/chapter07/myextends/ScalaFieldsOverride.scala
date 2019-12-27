package com.sencent.scala.chapter07.myextends

object ScalaFieldsOverride {
  def main(args: Array[String]): Unit = {
    val obj1 :AAA = new BBB
    val obj2:BBB = new BBB

    //obj1.age => obj1.age() // 动态绑定机制
    //obj2.age => obj2.age()
    println("obj1.age="+obj1.age+"\t obj2.age="+obj2.age )
  }
}

class AAA{
  val age:Int = 10
}

class BBB extends AAA{
  //看此覆盖的是属性，实际上是方法，从而可以用动态绑定机制
  override val age: Int = 20
}
