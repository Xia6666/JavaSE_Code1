package com.itheima.set01;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Random;

//LinkedHashSet是有序不重复的，是Set集合中比较特别的
public class Demo04 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet1=new LinkedHashSet<>();

        Random random=new Random();

       for(;linkedHashSet1.size()<6;)
       {
           linkedHashSet1.add(random.nextInt(33));
       }
       int blue= random.nextInt(16)+1;
        System.out.print("红球: ");
        linkedHashSet1.forEach(s-> System.out.print(s+" "));
        System.out.println();
        System.out.println("蓝球："+blue);
    }
}
