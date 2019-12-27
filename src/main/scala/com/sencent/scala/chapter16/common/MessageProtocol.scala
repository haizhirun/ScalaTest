package com.sencent.scala.chapter16.common

//ClientMessage 客户端发送给服务器的协议数据
case class ClientMessage(mes:String)

//ServerMessage 服务端会送给客户端的协议数据
case class ServerMessage(mes:String)
