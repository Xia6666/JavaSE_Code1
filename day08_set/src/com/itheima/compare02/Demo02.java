package com.itheima.compare02;

import java.util.Comparator;
import java.util.TreeSet;

//自然排序和比较器的不同点：
//1，自然排序写在泛型类中，比较器是写在集合的构造器中
//2，自然排序的复用性更高，一套规则反复利用。比较器更灵活，针对不同的TreeSet可以定制。
//3，二者同时存在时，比较器优先。

public class Demo02 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet=new TreeSet<>((o1, o2) -> o2-o1);
        treeSet.add(11);
        treeSet.add(66);
        treeSet.add(55);
        treeSet.add(22);
        treeSet.add(44);
        treeSet.add(33);
       treeSet.forEach(System.out::println);



    }
}
