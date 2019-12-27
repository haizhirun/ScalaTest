package com.sencent.scala.chapter15

class Customer {
  var id : Int = _
  var name : String = _
  var age : Int = _
  var gender : Char = _
  var phone : String = _
  var email : String = _

  //定义辅助构造器
  def this(id:Int,name:String,age:Int,gender:Char,phone:String,email:String){
    this
    this.id = id
    this.age = age
    this.name = name
    this.gender = gender
    this.phone = phone
    this.email = email
  }

  override def toString: String = {
    this.id + "\t" + this.name + "\t" + this.age +"\t" + this.gender + "\t" + this.phone + "\t\t" + this.email
  }

}
