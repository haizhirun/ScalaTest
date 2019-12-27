package com.sencent.scala.chapter06.constructor

object ConDemo01 {
  def main(args: Array[String]): Unit = {
    val p = new Person("gui",22)
    println(p)
    val p2 = new Person("chang")
    println(p2)
  }
}
//主构造器
class Person(inName:String,inAge:Int){
  var name : String = inName
  var age :Int = inAge
  age += 10
  println("---------------------")

  override def toString: String = {
    "name="+this.name + "\t" + "age=" + this.age
  }

  //定义辅助构造器
  def this(name:String){
    //辅助构造器，必须第一行显示调用主构造器，可以直接也可以间接
    this("jack",10)
    this.name = name
  }


}

