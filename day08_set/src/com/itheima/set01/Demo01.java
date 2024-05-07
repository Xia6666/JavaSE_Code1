package com.itheima.set01;

import java.util.HashSet;
import java.util.Set;

//set集合特点，存储无序，没有索引，不能重复
/*
*       1,首先计算元素的哈希值（默认通过地址值进行计算，但是一般都是重写hashCode（）方法来通过属性值来求解哈希值）。
*       2，再用计算出来的哈希值进行特殊的取模运算存入到数组中去，如果对应位置没有元素，就直接存入，否则进行判断。
*       3，判断二者的哈希值是否相等，如果不相等直接存入（jdk1.8之前是往前存，之后是往下存）
*       4，如果二者的哈希值相等就会发生哈希碰撞，比较equals，如果为ture就不存入，如果不相等，就存入。
*
*
*       关于扩容问题：1，默认是一个长度为16的数组，如果使用超过数组长度的0.75，就会扩容（两倍两倍的扩容，最多长度为64）
*                   2，链表的节点个数超过6，且数组的长度小于64时，就会扩容数组。
*
*       关于链表的红黑树转化问题：如果链表的节点长度大于六时候，会通过红黑树存储。
*                              数组长度超过64后也会转化为红黑树，链表的节点长度超过6以后也会自动转化。
* */

public class Demo01 {
    public static void main(String[] args) {

        Set<String> set=new HashSet<>();
        set.add("hello");
        set.add("hello");
        set.add("Java");
        set.forEach(System.out::println);

    }


}
