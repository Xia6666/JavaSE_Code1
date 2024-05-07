package com.itheima.stream01;

import java.io.Serializable;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("zhangsan");
        linkedHashSet.add("zhangsan1");
        linkedHashSet.add("zhangsan2");
        linkedHashSet.add("zhangsan3");


        Collections.addAll(arrayList,"王宝强","贾乃亮","陈羽凡","张三","张三丰","张无忌","迪丽热巴","古力娜扎","玛尔扎哈","杨幂");

        //获取Stream流的几种方式：
        //1,集合对象直接调用：
        arrayList.stream().forEach(System.out::println);

        //2,通过数组的工具类将获取数组的stream流：
        int[] a={1,2,3,4};
        IntStream stream = Arrays.stream(a);
        stream.forEach(System.out::println);

        //听过Stream.of()将一些零散的数据转化为stream流：
        Stream stream1 = Stream.of(1, "dsa", 1.2221);
        stream1.forEach(System.out::println);


        arrayList.stream().filter(name->name.length()>=3).filter(name->name.startsWith("张")).forEach(System.out::println);
    }
}
