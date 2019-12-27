package com.sencent.scala.chapter12

object CaseClassDemo {
  def main(args: Array[String]): Unit = {
    val currency = Currency(35.5,"RMB")
    println(currency.value + " " + currency.unit)
  }
}


abstract class Amount

case class Dollar(value:Double) extends Amount

case class Currency(value:Double,unit:String) extends Amount

case class Dog(name:String){
  var age = 10
  def cry()={
    println("dog is " + age + " old")
  }

}
