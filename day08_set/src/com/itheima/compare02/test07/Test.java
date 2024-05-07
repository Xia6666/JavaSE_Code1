package com.itheima.compare02.test07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Test {
    public static void main(String[] args) {
       /* HashSet<String> hashSet=new HashSet<>();
        Collections.addAll(hashSet,"美国","中国","英国","法国","西班牙","俄罗斯");
        hashSet.forEach(System.out::println);*/


        ArrayList<String> arrayList=new ArrayList<>();
        Collections.addAll(arrayList,"美国","中国","英国","法国","西班牙","俄罗斯");
        List<String> list = Collections.unmodifiableList(arrayList);
        list.add("日本");
        arrayList.forEach(System.out::println);
    }
    public static String getName(int age, String...name){
        return "";
    }
}
