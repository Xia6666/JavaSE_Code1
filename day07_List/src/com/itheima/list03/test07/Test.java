package com.itheima.list03.test07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Double> list =new ArrayList<>();
        Collections.addAll(list,12811.12,15335.5,8625.6,21288.26,18637.78);
        list.forEach(s-> System.out.print(s+" "));
        System.out.println();

        List<Double> list1=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list1.add(i, list.get(i)+200);
        }
        System.out.print("加工资之后：");
        list1.forEach(s-> System.out.print(s+" "));
    }
}
