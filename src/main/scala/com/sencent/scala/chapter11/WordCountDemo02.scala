package com.sencent.scala.chapter11

object WordCountDemo02 {
  def main(args: Array[String]): Unit = {
    val lines = List("atguigu han hello ", "atguigu han aaa aaa aaa ccc ddd uuu")
//    lines.flatMap(str2Arr) <==> lines.flatMap(_.split(" "))
    val res1: List[String] = lines.flatMap(_.split(" "))
    println(res1)
//    res1.map((x:String)=>(x,1)) <==>  res1.map((_,1))
    val res2: List[(String, Int)] = res1.map((_,1))
    println(res2)

    //分组统计
    res2.groupBy((x:(String,Int))=>x._1)
    val res3: Map[String, List[(String, Int)]] = res2.groupBy(_._1)
    println(res3)


//    val res4: Map[String, Int] = res3.map((x:(String, List[(String, Int)])) => (x._1,x._2.size))
    val res4: Map[String, Int] = res3.map((x)=>(x._1,x._2.size))
    println(res4)


    //排序
    val res5: List[(String, Int)] = res4.toList.sortBy((x:(String,Int))=>x._2).reverse
    println(res5)

    //汇总成一步
    val finalRes: List[(String, Int)] = lines.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).map((x) => (x._1, x._2.size)).toList.sortBy(_._2).reverse
    println(finalRes)

  }

  def str2Arr(str:String)={
    str.split(" ")
  }
}
