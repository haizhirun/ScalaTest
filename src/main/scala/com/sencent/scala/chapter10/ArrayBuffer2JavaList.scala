package com.sencent.scala.chapter10

import java.util

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object ArrayBuffer2JavaList {
  def main(args: Array[String]): Unit = {
    //scala集合和java集合互转
    var arr = ArrayBuffer("1","2","3")
    //使用隐式转换
    import scala.collection.JavaConversions.bufferAsJavaList
    ////对象 ProcessBuilder ， 因为 这里使用到上面的 bufferAsJavaList
    val javaList = new ProcessBuilder(arr)
    println(javaList)
    val arrList: util.List[String] = javaList.command()
    println(arrList)

    //将java的List转成scala的ArrayBuffer
    import scala.collection.JavaConversions.asScalaBuffer
     val scalaArr : mutable.Buffer[String] = arrList
    scalaArr.append("jack")
    scalaArr.remove(0)
    for (elem <- scalaArr) {
      println(elem)
    }

  }
}
