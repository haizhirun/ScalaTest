package com.sencent.scala.chapter15

import scala.io.StdIn
import scala.util.control.Breaks._

class CustomerView {
  var flag = true
  var key = ""
  var customerService = new CustomerService()
  def mainMenu(): Unit ={
    do{
      println("---------------客户信息管理软件-----------------")
      println("                    1 添加客户                   ")
      println("                    2 修改客户                   ")
      println("                    3 删除客户                   ")
      println("                    4 查询客户")
      println("                    5 退    出")
      key = StdIn.readLine()
      key match {
        case "1" => add()                 //println("1 添加用户")
        case "2" => edit()                //println("2 修改用户")
        case "3" => remove()              //println("3 删除用户")
        case "4" => show()                //println("4 用户列表")
        case "5" => flag = false
        case _ => println("请按照要求重新输入")
      }
    }while(flag)
  }

  def add(): Unit ={
    println("                    1 添加客户                   ")
    print("姓名：")
    val name = StdIn.readLine()
    print("年龄：")
    val age = StdIn.readInt()
    print("性别：")
    val gender = StdIn.readChar()
    print("电话：")
    val phone = StdIn.readLine()
    print("邮箱：")
    val email = StdIn.readLine()
    val customer = new Customer(0,name,age,gender,phone,email)
    this.customerService.add(customer)
    println("                    添加成功                   ")
  }

  def remove(): Unit ={
    var choice = ""
    breakable{
      do{
        println("确实是否删除(Y/N):")
        choice = StdIn.readLine().toUpperCase()
        if(choice.equals("Y") || "N".equals(choice)){
          break()
        }
      }while(true)
    }
    if(choice.equals("Y")){
      println("请输入待删除的客户编号：")
      val id = StdIn.readInt()
      this.customerService.del(id)
    }else{
      println("放弃删除...")
    }
  }

  def edit(): Unit ={

    var flag = true
    println("-----------修改客户---------------------")
    while(flag){
      print("请选择修改客户编号(-1退出)")
      val id = StdIn.readInt()
      if(id == -1){
        flag = false
      }else{
        if(this.customerService.edit(id)){
          println("-----------修改成功---------------------")
        }else{
          println("客户编号不存在...")
        }

      }
    }

  }

  def show(): Unit ={
    var flag = true
    while (flag){
      println("----------1 根据用户id查询客户----------------")
      println("----------2 根据姓名中关键字模糊查询客户信息---")
      println("----------3 根据完整姓名查询客户---------------")
      println("----------4 展示所有用户信息-------------------")
      println("----------5 退出查询-----------------------")
      val input = StdIn.readLine()
      input match{
        case "1" => findCustomerById()
        case "2" => findCustomerByKeyWord()
        case "3" => findCustomerByName()
        case "4" => this.customerService.showAllCustomers()
        case "5" => flag = false
        case _   => println("请按照给定的格式输入")
      }
    }
  }

  def findCustomerById(): Unit ={
    println("请输入输入用户id:")
    val id = StdIn.readLine().toInt
    this.customerService.findCustomerById(id)
  }
  def findCustomerByKeyWord(): Unit ={
    println("请输入关键词key：")
    val key = StdIn.readLine()
    this.customerService.findCustomerByKeyWord(key)
  }
  def findCustomerByName(): Unit ={
    println("请输入姓名name：")
    val name = StdIn.readLine()
    this.customerService.findCustomerByName(name)
  }

}
