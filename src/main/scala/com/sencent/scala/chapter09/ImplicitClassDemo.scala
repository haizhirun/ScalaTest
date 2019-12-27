package com.sencent.scala.chapter09



object ImplicitClassDemo {

  def main(args: Array[String]): Unit = {
    implicit class DB1(val m:MySQL1){
      def addSuffix(): String ={
        m+"scala"
      }
    }

    val mysql = new MySQL1()
    mysql.sayOK()
    println(mysql.addSuffix())//等价于DB1(mysql).addSuffix()
  }
}

class DB1{}

class MySQL1{

  def sayOK(): Unit ={
    println("sayOK")
  }
}

