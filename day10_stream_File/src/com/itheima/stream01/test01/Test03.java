package com.itheima.stream01.test01;

import java.util.Arrays;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "java8", "stream");

// 获取上述list集合所对应的流对象
        list.stream().map(s -> {
           list.add("world") ;                             // 向list集合中添加元素
            return s.toUpperCase();                         // 将流中的元素转换成大写
        }).forEach(System.out::println);            // 遍历流
    }

}
