package com.itheima.list03.test07;

import java.util.ArrayList;
import java.util.Collections;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        Collections.addAll(arrayList,"JavaEE企业级开发指南","Oracle高级编程","Oracle从入门到精通","Java架构师之路","Java核心思想");
        arrayList.forEach(s-> System.out.print(s+" "));
        System.out.println();
        arrayList.forEach(s->{if(s.length()<=10) System.out.print(s+" ");});
        System.out.println();
        arrayList.forEach(s->{if(s.contains("Java")) System.out.print(s+" ");});
        System.out.println();
        arrayList.removeIf(s->s.contains("Oracle"));
        arrayList.forEach(s -> System.out.print(s+" "));
    }
}
