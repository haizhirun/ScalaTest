package com.sencent.scala.chapter10;

import java.util.ArrayList;

public class JavaCollection {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[2] = 3;
//        nums[3] = 4;
        String[] names = {"sb","sh"};
        System.out.println(nums + " " + names);

        ArrayList<String> list = new ArrayList<String>();
        list.add("zs");
        list.add("lisi");
        System.out.println(list + "地址" + list.hashCode());
        //增加一个后，再查看地址是否变化
        list.add("wangwu");
        System.out.println(list + "地址" + list.hashCode());
    }
}
