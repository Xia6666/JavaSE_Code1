package com.itheima.wrapper;

public class Demo04 {
    public static void main(String[] args) {
        //Java底层对[-128,127]这个范围内的数字进行了封装（缓存的设计），如果是在这个范围内则直接在这个范围内的数组直接拿值，如果不在就需要创建对象，所以a3和a4的地址值不同。

        Integer a1=100;
        Integer a2=100;
        System.out.println(a1==a2);

        Integer a3=128;
        Integer a4=128;
        System.out.println(a3==a4);
    }
}
