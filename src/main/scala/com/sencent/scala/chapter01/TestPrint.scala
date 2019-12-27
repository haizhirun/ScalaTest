package com.sencent.scala.chapter01

object TestPrint {

  def main(args: Array[String]): Unit = {
    var name : String = "guikaisheng"
    var sal : Double = 1.2
    println("hello" + name + sal)


    //使用格式化的方式printf
    printf("name=%s,sal=%.2f\n",name,sal)
    //使用$引用的方式printf
    println(s"name=$name ,sal = ${sal+1}")


  }

}
