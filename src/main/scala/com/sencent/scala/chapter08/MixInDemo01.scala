package com.sencent.scala.chapter08

object MixInDemo01 {
  def main(args: Array[String]): Unit = {
    //在不修改 类的定义基础，让他们可以使用 trait 方法
    val oracleDB = new OracleDB with Operate3
    oracleDB.insert(100)

    val mysql = new MySQL with Operate3
    mysql.insert(200)

    val mysql_ = new MySQL_ with Operate3  {
      override def say(): Unit = {
        println("mysql_")
      }
    }
    mysql_.insert(300)
    mysql_.say()
  }
}

trait Operate3{
  def insert(id:Int): Unit ={
    println("插入id为:"+id)
  }
}

class OracleDB{}

abstract class MySQL{

}

abstract class MySQL_{
  def say()
}
