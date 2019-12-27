package com.sencent.scala.chapter15

import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn

class CustomerService {
  //用于存储所有的用户
  var customers = ArrayBuffer[Customer]()
  //便于显示，提前加上
  customers.append(new Customer(1,"桂凯胜",21,'男',"131","131@sina.com"))
  customers.append(new Customer(2,"赵畅",20,'女',"456","456@sina.com"))
  //id 呈现递增状态
  var totalCustomerNum = 2

  def add(customer: Customer)={
    totalCustomerNum += 1
    customer.id = totalCustomerNum
    customers.append(customer)
    true
  }
  //根据用户id来删除用户
  def del(id : Int): Unit ={

    val index = findIndexById(id)
    if(index == -1){
      println("客户编号不存在")
      return
    }
    customers.remove(index)
    println("-------------删除成功---------------")
  }

  def edit(id:Int): Boolean ={
    val index = findIndexById(id)
    if(index == -1){
      return false
    }
    val c = this.customers(index)
    print("姓名(张三)：")
    val name = StdIn.readLine().trim
    if (!"".equals(name)){
      c.name = name
    }
    print("性别(男)：")
    val gender = StdIn.readLine()
    if (!"".equals(gender)){
      c.gender = gender.charAt(0)
    }
    print("年龄(30):")
    val age = StdIn.readLine()
    if (!"".equals(age)){
      c.age = age.toInt
    }
    print("电话(010-12345678):")
    val phone = StdIn.readLine()
    if (!"".equals(phone)){
      c.phone = phone
    }
    print("邮箱(kaisheng_gui@sian.com):")
    val email = StdIn.readLine()
    if (!"".equals(email)){
      c.email = email
    }
    return true
  }

  //根据id返回该用户在ArrayBuffer中的下标，方便删除
  def findIndexById(id:Int):Int ={
    var index = -1
    for(i <- 0 until  customers.length){
      if(customers(i).id == id){
        index = i
      }
    }
    index
  }

  //展现所有客户信息
  def showAllCustomers(): Unit ={
    println("------------客户列表----------------")
    println("编号\t姓名\t年龄\t性别\t电话\t\t邮箱")
    for (c <- customers) {
      println(c)
    }
    println("-------------客户列表完成------------")
  }

  def findCustomerById(id:Int): Unit ={
    val index: Int = findIndexById(id)
    if(index == -1){
      println("用户编号不存在")
      return
    }
    println("编号\t姓名\t年龄\t性别\t电话\t\t邮箱")
    println(this.customers(index))
  }
  def findCustomerByKeyWord(key:String): Unit ={
    println("编号\t姓名\t年龄\t性别\t电话\t\t邮箱")
    var flag = true
    for (c <- customers) {
      if(c.name.contains(key)){
        flag = false
        println(c)
      }
    }
    if(flag){
      println("\t\t\t查无此人")
    }
  }
  def findCustomerByName(name:String): Unit ={
    println("编号\t姓名\t年龄\t性别\t电话\t\t邮箱")
    var flag = true
    for (c <- customers) {
      if(name.equals(c.name)){
        flag = false
        println(c)
      }
    }
    if(flag){
      println("\t\t\t查无此人")
    }
  }

}
