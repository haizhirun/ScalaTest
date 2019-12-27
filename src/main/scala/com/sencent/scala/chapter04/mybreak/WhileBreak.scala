package com.sencent.scala.chapter04.mybreak
import util.control.Breaks._
object WhileBreak {
  def main(args: Array[String]): Unit = {
    var sum = 0

    //方法一
    breakable{
      for(i <- 1 to 100){
        sum += i
        if(sum > 20){
          println(i)
          break()
        }
      }
    }

    //方法2：

    var flag = true
    var sum2 = 0
    for(i <- 1 to 100 if flag == true){
      sum2 += i
      if(sum2 > 20){
        println(i)
        flag = false
      }
    }



  }
}
