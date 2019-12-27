package com.sencent.scala.chapter08.innerclass


object ScalaInnerClassDemo {
  def main(args: Array[String]): Unit = {
    val outer1 = new ScalaOuterClass()
    val outer2 = new ScalaOuterClass()

    val inner1 = new outer1.ScalaInnerClass
    val inner2 = new outer2.ScalaInnerClass
    inner1.info()
    println(inner2)
    inner1.test(inner2)

    //创建静态内部类实例
    val staticInner = new ScalaOuterClass.ScalaStaicInnerClass()


  }
}

class ScalaOuterClass{


  //成员内部类
//  class ScalaInnerClass{
//    //内部类访问外部类的属性的方法 1 外部类名.this.属性
//    def info(): Unit ={
//      println("name="+ScalaOuterClass.this.name+"  sal="+ScalaOuterClass.this.sal)
//    }
//  }
  //内部类访问外部类的属性的方法 2 使用别名的方式
  myouter=> //可以看成外部类的别名，看做是外部类的一个实例,还必须放在行首
  class ScalaInnerClass{
    def info(): Unit ={
      println("name="+myouter.name + " sal = " + myouter.sal)
    }
    //下面的 ScalaOuterClass#ScalaInnerClass类型投影的作用就是屏蔽外部对象对内部类对象的影响
    def test(ic:ScalaOuterClass#ScalaInnerClass): Unit ={
      System.out.println(ic)
    }


  }

  var name = "scoot"
  private var sal = 30000.9
}

//伴生类
object ScalaOuterClass{
  //静态内部类
  class ScalaStaicInnerClass{

  }
}