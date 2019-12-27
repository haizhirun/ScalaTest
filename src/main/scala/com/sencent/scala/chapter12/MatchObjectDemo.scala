package com.sencent.scala.chapter12

object MatchObjectDemo {
  def main(args: Array[String]): Unit = {
    val number = 36.0
    number match {
      case Square(n) => println(n)
      case _ => println("nothing matched")
    }
  }
}


object Square{
  def unapply(z: Double): Option[Double] ={
    println("unapply被调用 z="+z)
    Some(math.sqrt(z))
  }

  def apply(z:Double): Double = z * z
}