package com.sencent.scala.chapter12

object MatchObjectDemo02 {
  def main(args: Array[String]): Unit = {
    val str = "aaa,bbb,ccc"
    str match {
      case Names(a,b,c)=>{
        println(s"$a,$b,$c")
      }
      case _ =>println("匹配失败")
    }
  }
}

object Names{
  def unapplySeq(str:String)={
    if(str.contains(",")){
      Some(str.split(","))
    }else{
      None
    }
  }
}
