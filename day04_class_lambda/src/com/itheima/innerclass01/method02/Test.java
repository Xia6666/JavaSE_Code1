package com.itheima.innerclass01.method02;

public class Test {
    public static void main(String[] args) {
        OutClass.InnerClass inner=new OutClass().new InnerClass();
        inner.method();

        OutClass out=new OutClass();
        out.method();

        OutClass.InnerClass1 class1=new OutClass.InnerClass1();
        class1.method();

        OutClass.InnerClass1.method1();
    }

}
