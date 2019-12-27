package com.sencent.scala.chapter17

import com.sencent.scala.chapter17.SeasonEm.SeasonEm

/**
  *请设计一个EnglishClass (英语班级类)，在创建EnglishClass的一个实例时，需要指定[ 班级开班季节(spring,autumn,summer,winter)、班级名称、班级类型]
*开班季节只能是指定的，班级名称为String, 班级类型是(字符串类型 "高级班", "初级班"..) 或者是 Int 类型(1, 2, 3 等)
 *
 */
object GenericDemo02 {
  def main(args: Array[String]): Unit = {

    val class01 = new EnglishClass[SeasonEm,String,String](SeasonEm.spring,"软硕1804","高级班")
    val class02 = new EnglishClass[SeasonEm,String,Int](SeasonEm.summer,"信科11402",2)

    println(class01.season+"\t"+class01.name + "\t"+class01.classType)
    println(class02.season+"\t"+class02.name + "\t"+class02.classType)

  }
}

/**
  * 定义一个枚举类
  */
object SeasonEm extends Enumeration{
  type SeasonEm = Value
  val spring,summer,autumn,winter = Value
}

class EnglishClass[A,B,C](val season:SeasonEm,val name:B,val classType:C)