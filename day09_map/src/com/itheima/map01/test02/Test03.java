package com.itheima.map01.test02;

import java.util.HashMap;

public class Test03 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put( 101,"阿三面馆");
        hashMap.put( 102,"阿四粥馆");
        hashMap.put( 103,"阿五米馆");
        hashMap.put( 104,"阿六快递");

        System.out.println("方式一   键找值");
        hashMap.keySet().forEach(s-> System.out.println(s+"--"+hashMap.get(s)));
        System.out.println("=============");

        System.out.println("方式二   键值对对象");
        hashMap.entrySet().forEach(s-> System.out.println(s.getKey()+"--"+s.getValue()));
        System.out.println("=============");

        System.out.println("方式三   接口中默认的forEach方法配合lambda");
        hashMap.forEach((k,v)-> System.out.println(k+"--"+v));

    }
}
