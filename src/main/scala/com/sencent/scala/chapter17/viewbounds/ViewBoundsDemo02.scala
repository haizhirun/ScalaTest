package com.sencent.scala.chapter17.viewbounds

object ViewBoundsDemo02 {
  def main(args: Array[String]): Unit = {
    val jack = new Person("jack",20)
    val tom = new Person("tom",30)
    val compareComm2 = new CompareComm2(jack,tom)
    println(compareComm2.greater2)
    println((jack > tom))

  }
}

class Person(val name:String,val age:Int) extends Ordered[Person]{
  //添加自己的比较逻辑
  override def compare(that: Person): Int = {
    println("compare方法被调用")
    this.age - that.age
  }

  override def toString: String = {
    this.name + "\t" + this.age
  }
}




class CompareComm2[T <% Ordered[T]](obj1:T,obj2:T){
  def greater = if(obj1 > obj2) obj1 else obj2

  def greater2 = if(obj1.compareTo(obj2) > 0) obj1 else  obj2
}

