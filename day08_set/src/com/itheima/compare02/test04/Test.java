package com.itheima.compare02.test04;/*
    现获取到一个字符串"90 -7 0 18 2 0 2 2 45 4"，其中的数据是空格间隔的一些数字，
    请使用集合所学知识将字符串中的数值进行降序排序，但不要去除其中的重复数字。
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<String> treeSet=new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i = Integer.parseInt(o2) - Integer.parseInt(o1);
               i= i==0?1:i;
               return i;
            }
        });

        ArrayList<String> arrayList=new ArrayList<>();
        String s="90 -7 0 18 2 0 2 2 45 4";
        String[] s1 = s.split(" ");
        Collections.addAll(treeSet,s1);
       // arrayList.sort((o1, o2) -> Integer.parseInt(o2) - Integer.parseInt(o1));

        treeSet.forEach(System.out::println);
       // arrayList.forEach(System.out::println);




    }
}