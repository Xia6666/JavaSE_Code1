package com.itheima.compare02.test05;

import java.util.Collections;
import java.util.HashSet;

public class Test01 {
    public static void main(String[] args) {
        String string="2.2,5.5,6.6,2.2,8.8,1.1,2.2,8.8,5.5,2.2,6.6";
        HashSet<String> hashSet=new HashSet<>();
        Collections.addAll(hashSet,string.split(","));
        System.out.print("去除重复元素后，结果是："+hashSet);
    }
}
