package com.sencent.scala.chapter07.myextends

object TypeConvert {
  def main(args: Array[String]): Unit = {
    println(classOf[String])//class java.lang.String
    val s = "king"
    println(s.getClass.getName)//java.lang.String

    //
    var p1 = new Person200
    var emp = new Emp200

    p1 = emp
    p1.printName()
//    p1.sayHi()

    if(p1.isInstanceOf[Emp200]){
      val emp2 = p1.asInstanceOf[Emp200]
      emp2.sayHello()
    }


  }
}
class Person200 {
  var name: String = "tom"
  def printName() { //输出名字
    println("Person printName() " + name)
  }
  def sayHi(): Unit = {
    println("sayHi...")
  }
}

class Emp200 extends Person200 {
  //这里需要显式的使用 override
  override def printName() {
    println("Emp printName() " + name)
    //在子类中需要去调用父类的方法,使用 super
    super.printName()
    sayHi()
  }
  def sayHello(): Unit = {
  }
}