package com.itheima.stream01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo03 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        Collections.addAll(arrayList,"王宝强,35","贾乃亮,37","陈羽凡,34","张三,20","张三丰,108","张无忌,18","迪丽热巴,31","古力娜扎,20","玛尔扎哈,1000","杨幂,45");

        arrayList.stream().filter(s->s.startsWith("张")).collect(Collectors.toList()).forEach(System.out::println);


        Map<String, String> stringMap = arrayList.stream().collect(Collectors.toMap(s -> s.split(",")[0], s -> s.split(",")[1]));
        stringMap.forEach((k,v)-> System.out.println(k+":"+v));
    }
}
