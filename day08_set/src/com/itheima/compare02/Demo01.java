package com.itheima.compare02;

import java.util.Collections;
import java.util.TreeSet;

//TreeSet集合中存入数据会默认排序。
public class Demo01 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet=new TreeSet<>();
        Collections.addAll(treeSet,22,11,55,44,33,66,88,77);
        treeSet.forEach(System.out::println);
    }
}
