package com.sencent.scala.chapter04.myfor

object stepfor {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10){
      println("i = " + i)
    }
    //控制步长，range不包含最后
    for(i <- Range(1,10,1)){
      println("i = " + i)
    }
    //守卫
    for (i <- 1 to 10 if i % 2 != 0){
      println("i = " + i)
    }


    for(i <- 1 to 9){
      for(j <- 1 to i){
        print(s"$i * $j = ${i * j}"+"\t")
      }
      //换行
      println()
    }

    var i =1
    while(i<=9){
     var j = 1
      while(j <= i){
        print(s"$i * $j = ${i * j}"+"\t")
        j+=1
      }
      i+=1
      println()
    }


  }
}
