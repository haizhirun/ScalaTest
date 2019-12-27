package com.sencent.scala.chapter06.oop

object CreateObj {
  def main(args: Array[String]): Unit = {
    val emp = new Emp
    val emp2 : Person = new Emp
  }
}

class Emp extends Person{

}

class Person{

}