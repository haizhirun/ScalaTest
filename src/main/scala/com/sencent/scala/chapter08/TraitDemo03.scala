package com.sencent.scala.chapter08

object TraitDemo03 {
  def main(args: Array[String]): Unit = {
    val sheep = new Sheep
    sheep.sayHi()
    sheep.sayHello()
  }
}

trait Trait03{
  def sayHi()

  def sayHello(): Unit ={
    println("say Hello ...")
  }
}

class Sheep extends Trait03{
  override def sayHi(): Unit = {
    println("Sheep")
  }
}