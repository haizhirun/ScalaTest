package com.sencent.scala.chapter07.visit

/**
  * 测试Scala 中包的可见性和访问修饰符的使用
  */
object TestVisit {
  def main(args: Array[String]): Unit = {
    val c = new Clerk()
    c.showInfo()
    Clerk.test(c)

    val p1 = new Person
    println(p1.name)
  }
}


/**
  * 伴生类:写非静态内容
  */
class Clerk{
  var name:String = "kaisheng"
  private val sal:Double = 9999.9
  protected var age = 10
  var job:String = "大数据工程师"


  def showInfo(): Unit ={
    println(s"name=$name  sal=$sal  age=$age  job=$job")
  }
}

/**
  * 伴生对象：写静态内容
  */
object Clerk{

  def test(c:Clerk): Unit ={
    println("test() name="+c.name + " sal= "+c.sal +" age="+c.age +" job="+c.job)
  }
}

class Person{
  protected[visit] val name = "jack"
}
