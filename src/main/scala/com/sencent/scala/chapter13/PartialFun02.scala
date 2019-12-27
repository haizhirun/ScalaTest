package com.sencent.scala.chapter13

object PartialFun02 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,"abc")
    //	构建偏函数时，参数形式   [Any, Int]是泛型，第一个表示传入参数类型，第二个表示返回参数
    val f1 = new PartialFunction[Any,Int] {

      override def isDefinedAt(x: Any): Boolean = {
        println("aaa")
        x.isInstanceOf[Int]
      }

      override def apply(v1: Any): Int = {
          v1.asInstanceOf[Int] + 1
      }
    }

    println(f1)

    val list2 = list.collect(f1)

    println("list2="+list2)

    //简化形式的偏函数
    def f2:PartialFunction[Any,Int]={
      case i:Int => i + 1
    }

    val list3 = list.collect(f2)
    println(list3)

   //val list4 = list.collect(case i:Int => i+1)


  }
}
