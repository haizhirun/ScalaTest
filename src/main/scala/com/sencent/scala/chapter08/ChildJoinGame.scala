package com.sencent.scala.chapter08

object ChildJoinGame {
  def main(args: Array[String]): Unit = {
    val child1 = new Child("k1")
    val child2 = new Child("k2")
    val child3 = new Child("k3")
    Child.join(child1)
    Child.join(child2)
    Child.join(child3)
    Child.showNum()
  }
}
class Child(cName:String){
  var name = cName
}
object Child{
  var totalNum = 0

  def join(c:Child): Unit ={
    printf("%s加入了游戏\n",c.name)
    totalNum +=1
  }

  def showNum(): Unit ={
    printf("当前有%d个小孩加入了该游戏\n",totalNum)
  }
}

