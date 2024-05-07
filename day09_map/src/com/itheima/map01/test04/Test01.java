package com.itheima.map01.test04;

import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test01 {
    public static void main(String[] args) {
        TreeMap<Character, TreeSet<String>> treeMap=new TreeMap<>();
        TreeSet<String> treeSet1=new TreeSet<>();
        Collections.addAll(treeSet1,"阿尔巴尼亚","阿尔及利亚");

        treeMap.put('A',treeSet1);
        treeMap.forEach((k,v)-> System.out.println(k+"--"+v));

    }
}
