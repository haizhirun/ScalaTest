package com.sencent.scala.chapter05.mylazy

/**
  * 异常捕捉的机制与其他语言中一样，如果有异常发生，catch 子句是按次序捕捉的。因此，在 catch
  * 子句中， 越具体的异常越要靠前，越普遍的异常越靠后，如果把越普遍的异常写在前，把具体的异常
  * 写在后，在 在 scala  中也不会报错，但这样是非常不好的编程风格。
  */
object ScalaExceptionDemo01 {
  def main(args: Array[String]): Unit = {

    f11()







    try {
      //var r = 10/0
    }catch {
      case ex:ArithmeticException=>{
        println("除数为0")
      }
      case ex:Exception=>{
        println("异常..."+ex.printStackTrace())
      }

    }finally {
      println("scala finally ...")
    }
  }

  @throws(classOf[NumberFormatException])
  def f11() ={
    "abc".toInt
  }
}
