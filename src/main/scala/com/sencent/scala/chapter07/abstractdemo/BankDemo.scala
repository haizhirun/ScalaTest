package com.sencent.scala.chapter07.abstractdemo

object BankDemo {
  def main(args: Array[String]): Unit = {

  }
}

class Account(inAccount:String,inBalance:Double,inPwd:String){
  //属性：账号，密码，余额
  val accountNo:String = inAccount
  var pwd :String = inPwd
  var balance:Double = inBalance
  //方法：查询，取款，存款

  def query(pwd:String): Unit ={
    if(!this.pwd.equals(pwd)){
      println("密码错误")
      return
    }
    println(s"账号为$accountNo 余额为$balance")
  }

  //取款
  def withdrow(pwd:String,money:Double): Unit ={
    if(!this.pwd.equals(pwd)){
      println("密码错误")
      return
    }

    if(money < balance){
      println("余额不足")
      return
    }
    this.balance -= money
  }

}
