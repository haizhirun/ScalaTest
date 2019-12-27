package com.sencent.scala.chapter11
import scala.collection.mutable
/*
实现大数据中经典的wordcount案例
要求: val lines = List("atguigu han hello ", "atguigu han aaa aaa aaa ccc ddd uuu")
 */
object WordCountDemo01 {
  def main(args: Array[String]): Unit = {
    val lines = List("atguigu han hello", "atguigu han aaa aaa aaa ccc ddd uuu")
//    lines.flatMap(putWord)
    var map = mutable.Map[String,Int]()
    lines.foldLeft(map)(putWord)
    for (elem <- map) {
      println(elem._1 + " " + elem._2)
    }
  }

  def putWord(map:mutable.Map[String,Int],str:String)={
    val s: Array[String] = str.split(" ")
    for (elem <- s) {
      map += ((elem,map.getOrElse(elem,0)+1))
    }
    map
  }
}
