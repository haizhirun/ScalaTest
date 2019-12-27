package com.sencent.scala.chapter06.constructor

import scala.beans.BeanProperty


object BeanPropertyDemo {
  def main(args: Array[String]): Unit = {
    var car = new Car
    car.name = "test"
    println(car.getName)
    car.setName("kaisheng")
    println(car.getName)
  }
}

class Car{
  @BeanProperty var name:String = null
}
