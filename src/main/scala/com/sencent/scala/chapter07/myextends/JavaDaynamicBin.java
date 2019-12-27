package com.sencent.scala.chapter07.myextends;

public class JavaDaynamicBin {
    public static void main(String[] args) {
        //将一个子类的对象地址，交给了一个 AA(父类的)引用
        //java 的动态绑定机制的小结
        //1.如果调用的是方法，则 Jvm 机会将该方法和对象的内存地址绑定
        //2.如果调用的是一个属性，则没有动态绑定机制，在哪里调用，就返回对应值
        AA obj =  new BB();
        System.out.println(obj.sum());//40  //30
        System.out.println(obj.sumI());//30  //20

    }
}


class AA{
  public  int i = 10;
  public int sum(){
      return getI()+10;
  }
  public int getI(){
      return  i;
  }
  public int sumI(){
      return i + 10;
  }
}

class BB extends AA{
    public int i = 20;
    public int getI(){
        return i;
    }
//    public int sum(){
//        return i + 20;
//    }
//    public int sumI(){
//        return i+10;
//    }
}


