package com.sencent.scala.chapter10;

import java.util.HashMap;

public class JavaHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<String, Integer>();
        hm.put("aaa",111);
        hm.put("bbb",222);
        hm.put("ccc",333);
        hm.put("ddd",444);
        System.out.println(hm);
        hm.put("aaa",199);
        System.out.println(hm);
        System.out.println(hm.getOrDefault("aaa", 999));
    }
}
