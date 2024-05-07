package com.itheima.map01;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Demo03 {
    public static void main(String[] args) {
        Map<String,String> hashMap=new HashMap<>();
        hashMap.put("吕布","貂蝉");
        hashMap.put("周瑜","小乔");
        hashMap.put("孙策","大乔");
        hashMap.put("刘备","甘夫人");

        //通过keySet方法将集合中的键存放到Set集合中，再通过Set集合的迭代器获取每个键，再通过Map集合中的get()方法获取value值
        hashMap.keySet().forEach(s-> System.out.println(hashMap.get(s)));

        hashMap.forEach((key, value) -> System.out.println(key + "--->" + value));

        for (String string : hashMap.keySet()) {
            System.out.println(hashMap.get(string));
        }

        hashMap.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s+"--->"+s2);
            }
        });

    }
}
