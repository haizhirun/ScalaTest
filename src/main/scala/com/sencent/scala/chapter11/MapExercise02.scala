package com.sencent.scala.chapter11

import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable

object MapExercise02 {
  def main(args: Array[String]): Unit = {
    val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
    var map = mutable.Map[Char,Int]()
    val resMap: mutable.Map[Char, Int] = sentence.foldLeft(map)(putChar)
    println(map.toArray.sortBy((x: (Char, Int)) => x._2).mkString(" "))
//    for (elem <- map) {
//      println(elem._1 + " " + elem._2)
//    }
  }

  def putChar(map:mutable.Map[Char,Int],ch:Char)={
    val count: Int = map.getOrElse(ch,0)
    map.put(ch,count+1)
    map += ((ch,(map.getOrElse(ch,0)+1)))

//    map
  }
}
