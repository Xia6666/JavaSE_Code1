package com.itheima.bigdecimal.test;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        long big = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            arrayList.add(i);
        }
        long now = System.currentTimeMillis();
        System.out.println(now-big);

    }
}
