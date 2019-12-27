package com.sencent.scala.chapter12

object MatchDemo02 {
  def main(args: Array[String]): Unit = {
    for(ch <- "+-3!"){
      var sign = 0
      var digit = 0
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        case _ if ch.toString.equals("3") => digit = 3
        case _ => digit = 2
      }
      println(ch + "  "+ sign + " " + digit)
    }

  }
}
