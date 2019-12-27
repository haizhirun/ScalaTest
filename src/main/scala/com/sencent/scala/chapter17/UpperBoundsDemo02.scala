package com.sencent.scala.chapter17

import com.sencent.scala.chapter17.LowerBoundsDemo01.biophony

object UpperBoundsDemo02 {

def main(args: Array[String]): Unit = {
  biophony(Seq(new Bird,new Bird))
  biophony(Seq(new Animal, new Animal))
  biophony(Seq(new Animal, new Bird))
  //biophony(Seq(new Earth02, new Earth02))


}

def biophony[T <: Animal](things:Seq[T])=things.map(_.sound)
}


class Earth { //Earth 类
  def sound()= { //方法
    println("hello earth!")
  }
}

class Animal extends Earth {
  override def sound() = { //重写 sound
    println("animal sound")
  }
}

class Bird extends Animal {
  override def sound() = { //重写sound
    println("bird sounds")
  }
}
