package com.sencent.scala.chapter05.recursive

/**
  * 题 3：猴子吃桃子问题
  * 有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！以后每天猴子都吃其中的一半，然后
  * 再多吃一个。当到第十天时，想再吃时（还没吃），发现只有 1 个桃子了。问题：最初共多少个桃
  * 子？
  */
object Exercise03 {
  def main(args: Array[String]): Unit = {
      println(peach(9))
  }

  /**
    *
    * @param day
    * @return  第几天的桃子数
    */
  def peach(day: Int): Int ={
    if(day == 10){
      1
    }else{
      (peach(day+1)+1) * 2
    }
  }
}
