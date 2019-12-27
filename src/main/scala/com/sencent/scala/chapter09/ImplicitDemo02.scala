package com.sencent.scala.chapter09

object ImplicitDemo02 {
  def main(args: Array[String]): Unit = {

    implicit def toDB(mysql:MySQL):DB={
      new DB
    }

    val mysql = new MySQL
    mysql.insert()
    mysql.update()
    mysql.delete()

  }
}

class MySQL{
  def insert(): Unit ={
    println("insert")
  }
}

class DB{
  def delete(): Unit ={
    println("delete")
  }

  def update(): Unit ={
    println("update")
  }
}
