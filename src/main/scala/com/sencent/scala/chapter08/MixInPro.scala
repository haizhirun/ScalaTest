package com.sencent.scala.chapter08

object MixInPro {
  def main(args: Array[String]): Unit = {
    val mysql = new MySQL6 with DB6{
      override var sal: Int = _
    }
    mysql.insert()
  }
}

trait DB6{
  var sal:Int//抽象字段
  var opertype:String = "insert"
  def insert(): Unit ={
      println("insert")
  }
}

class MySQL6{

}
