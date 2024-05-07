package com.itheima.stream01.test01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Test09 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"王佳乐","张三丰","王思聪","张飞","刘晓敏","张靓颖","王敏");
        System.out.println("集合中原始的元素是："+list);
        Stream<String> stringStream1 = list.stream().filter(s -> s.startsWith("张"));
        Stream<String> stringStream2 = list.stream().filter(s -> s.startsWith("王"));
        long count = Stream.concat(stringStream1, stringStream2).filter(s -> s.length() == 3).count();
        System.out.println("姓张的和姓王的并且名字是三个字的人数有："+count);
    }
}
