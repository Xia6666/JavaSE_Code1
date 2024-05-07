package com.itheima.list03.test02;

import java.util.ArrayList;
import java.util.Collection;

public class Test01 {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("JavaEE企业级开发指南");
        collection.add("Oracle高级编程");
        collection.add("MySQL从入门到精通");
        collection.add("Java架构师之路");

        System.out.println("---所有元素如下---");
        collection.forEach(System.out::println);

        System.out.println("---书名小于十个字符的如下---");
        for (String string : collection) {
            if(string.length()<10)
                System.out.println(string);
        }

        System.out.println("---书名中包含Java的---");
        for (String string : collection) {
            if(string.contains("Java"))
                System.out.println(string);
        }

        System.out.println("---删除包含Oracle书名的书籍---");
        collection.removeIf(s->s.contains("Oracle"));
        for (String string : collection) {
            System.out.println(string);
        }

    }
}
