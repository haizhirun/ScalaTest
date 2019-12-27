package com.sencent.scala.chapter17

object UpperBoundsDemo01 {
  def main(args: Array[String]): Unit = {
    val commonComp01 = new CommonComp[Integer](Integer.valueOf(10),Integer.valueOf(20))
    println(commonComp01.greater)

    val commonComp02 = new CommonComp(java.lang.Float.valueOf(1.1f),java.lang.Float.valueOf(1.2f))
    println(commonComp02.greater)

    val commonComp03 = new CommonComp[java.lang.Float](1.1f,1.2f)
    println(commonComp03.greater)

//    val commonComp04 = new CommonComp(2.2f,2.3f)
//    println(commonComp04.greater)

  }
}


class CommonComp[T <: Comparable[T]](obj1:T,obj2:T){
  def greater:T = if(obj1.compareTo(obj2)>0) obj1 else obj2
}