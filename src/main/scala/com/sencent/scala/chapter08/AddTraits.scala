package com.sencent.scala.chapter08

object AddTraits {
  def main(args: Array[String]): Unit = {
    val mysql = new MySQL4 with DB4 with File4
    println(mysql)
    mysql.insert(100)
    /*
    Operate4...
    Data4
    DB4
    File4
    com.sencent.scala.chapter08.AddTraits$$anon$1@2eda0940
    向文件
    向数据库
    插入id:100
     */
    println("============================")
    val mysql2 = new MySQL4 with File4 with DB4
    println(mysql2)
    mysql2.insert(200)
    /*
    Operate4...
    Data4
    File4
    DB4
    com.sencent.scala.chapter08.AddTraits$$anon$2@56cbfb61
    向数据库
    向文件
    插入id:200
     */
  }
}

trait Operate4{
  println("Operate4...")
  def insert(id:Int)//抽象方法
}

trait Data4 extends Operate4{
  println("Data4")

  override def insert(id: Int): Unit = {
    println("插入id:"+id)
  }
}

trait DB4 extends Data4 {
  println("DB4")

  override def insert(id: Int): Unit = {
    println("向数据库")
    super.insert(id)
  }
}

trait File4 extends Data4{
  println("File4")

  override def insert(id: Int): Unit = {
    println("向文件")
    super.insert(id)
  }
}

class MySQL4{}