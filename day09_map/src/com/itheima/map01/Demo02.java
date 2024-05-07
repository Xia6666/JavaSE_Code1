package com.itheima.map01;

import java.util.HashMap;
import java.util.Map;

public class Demo02 {
    public static void main(String[] args) {
        Map<String,String> hashMap=new HashMap<>();

        //需求1：添加四对情侣
        hashMap.put("吕布","貂蝉");
        hashMap.put("周瑜","小乔");
        hashMap.put("孙策","大乔");
        hashMap.put("刘备","甘夫人");
        System.out.println(hashMap);


        //需求2:将刘备的夫人改为：孙尚香
        hashMap.put("刘备","孙尚香");
        System.out.println(hashMap);

        //需求3:查找周瑜对象
        String name = hashMap.get("周瑜");
        System.out.println(name);

        //需求4:删除孙策，大乔
        hashMap.remove("孙策");
        System.out.println(hashMap);

        //需求5:判断集合中是否包含吕布这个人
        if (hashMap.containsKey("吕布")) {
            System.out.println("有吕布");
        } else {
            System.out.println("没有有吕布");
        }


        //需求6:判断集合是否为空，如果不为空，则打印集合的键值对的个数。
        if (!hashMap.isEmpty())
            System.out.println(hashMap.size());
        else
            System.out.println("集合为空");

        //需求7:清空集合
        hashMap.clear();
        System.out.println(hashMap);

    }
}
