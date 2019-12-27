package com.sencent.scala.chapter07.myextends

object ScalaBaseConstrator {
  def main(args: Array[String]): Unit = {
//    val emp1 = new Emp700()

    println("=======================")

    val emp2 = new Emp700("chang")
    println("**************************")

    //分析执行的顺序
    //1.Person...
    //2.默认的名字
    //3.Emp ....
    //4.Emp 辅助构造器~
    val emp3 = new Emp700("smith")

    val emp4 = new Emp700("terry",10)
    emp4.showInfo()
  }
}

//父类
class Person700(pName:String){
  var name = pName
  def this(){
    this("kaisheng")
    println("默认的名字")
  }
}
/*
class Emp700() extends Person700(){
  println("Emp")
  def this(name:String){
    this()
    this.name = name
    println("Emp辅助构造器")
  }
}
*/
class Emp700(eName:String,eAge:Int) extends Person700(eName){
  println("Emp...")
  def this(name:String){
    this(name,100)
    this.name = name
    println("Emp辅助构造器")
  }

  def showInfo(): Unit ={
    println("雇员的名字",name)
  }
}
