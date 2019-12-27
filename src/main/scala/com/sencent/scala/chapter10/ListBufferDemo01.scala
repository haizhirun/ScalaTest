package com.sencent.scala.chapter10

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object ListBufferDemo01 {
  def main(args: Array[String]): Unit = {
    val list01 = ListBuffer[Int](1,2,3)
    println(list01(0))
    for (elem <- list01) {
      println(elem)
    }

    val list02 = new ListBuffer[Int]
    println(list02.hashCode())
    list02 += 4  //实际上
    list02.append(5)
    println(list02.hashCode())
    list01 ++= list02
    println(list01)


    val q1 = new mutable.Queue[Any]()
    println(q1)
    q1 += 9
    println(q1)

    q1 ++= List(10,0)//将list中的每个元素添加到队列末尾
    println(q1)
    q1 += List(20,30)//表示将List(20,30)作为一个元素加入到队列中

    println(q1)

    val elem = q1.dequeue()
    println("elem="+elem + "\t q1="+q1)

    q1.enqueue(List(1,2,3))//将List(1,2,3)作为一个元素加入末尾
    println(q1)
    q1.enqueue(100,200,300)
    println(q1)

    println(q1.head)
    println(q1.last)
    // 取出队尾的数据 ,即：返回除了第一个以外剩余的元素，可以级联使用
    println(q1.tail)
    println(q1.tail.tail.tail)

  }
}
