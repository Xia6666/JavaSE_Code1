package com.itheima.stream01.test01;

import java.util.Collections;
import java.util.HashSet;

public class Test08 {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        Collections.addAll(hashSet,"王佳乐","张三丰","王思聪","张飞","刘晓敏","张靓颖","王敏");
        System.out.println("Set集合的原始元素是："+hashSet);
        System.out.print("前两个姓张的元素是：");
        hashSet.stream().filter(s -> s.startsWith("张")).limit(2).forEach(s-> System.out.print(s+" "));
        System.out.print("\n跳过第一个姓王的元素是：");
        hashSet.stream().filter(s->s.startsWith("王")).skip(1).forEach(s-> System.out.print(s+" "));
    }
}
