package com.sencent.scala.chapter12

object MatchTupleDemo {
  def main(args: Array[String]): Unit = {
    val arr = Array((0,1),(34,89),(1,0),(1,1),(1,0,2))
    for(pair <- arr){
      val result = pair match {
        case (0, _) => "0..."
        case (y, 0) => y
        case (x, y) => (y, x)
        case _ => "other"
      }
      println(result)
    }
  }
}
