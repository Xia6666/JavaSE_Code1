package com.itheima.date01;

public class Test11 {
    public static void main(String[] args) {
        f();
        Integer i = 12;
        int i1 = i.intValue();
    }

    private static void f() {
        System.out.println("调用了f方法");
        h();
    }

    private static void h() {
        System.out.println("调用了h方法");
        f();
    }

}
