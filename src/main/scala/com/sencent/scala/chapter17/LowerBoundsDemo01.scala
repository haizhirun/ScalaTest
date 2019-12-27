package com.sencent.scala.chapter17

import com.sencent.scala.chapter17.UpperBoundsDemo02.biophony

object LowerBoundsDemo01 {
  def main(args: Array[String]): Unit = {
    //ok
    biophony(Seq(new Earth02, new Earth02)).map(_.sound())
    //ok
    biophony(Seq(new Animal02, new Animal02)).map(_.sound())
    //ok
    biophony(Seq(new Bird02, new Bird02)).map(_.sound())

    //控制看
    val res = biophony(Seq(new Bird, new Bird))
    val res2 = biophony(Seq(new Moon, new Moon))

  }

  /**
    *
    * @param things 是一个集合T的泛型
    * @tparam T  Animal02是T的下界
    * @return
    */
  def biophony[T >: Animal02](things:Seq[T])=things
}
class Earth02 { //Earth02 类
  def sound()= { //方法
    println("hello Earth02!")
  }
}

class Animal02 extends Earth02 {
  override def sound() = { //重写 sound
    println("Animal02 sound")
  }
}

class Bird02 extends Animal02 {
  override def sound() = { //重写sound
    println("Bird02 sounds")
  }
}
//独立类,普通类.
class Moon {}
