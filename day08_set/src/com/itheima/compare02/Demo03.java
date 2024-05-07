package com.itheima.compare02;

import java.util.ArrayList;
import java.util.Collections;

public class Demo03 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(11);
        arrayList.add(55);
        arrayList.add(22);
        arrayList.add(33);
        arrayList.add(66);

        Collections.sort(arrayList);
        arrayList.forEach(System.out::println);

        Collections.sort(arrayList,(o1,o2)->o2-o1);
        arrayList.forEach(System.out::println);


    }


}
