package com.itheima.innerclass01.method02;

public class OutClass {

    private int age=100;

    public class InnerClass{
        private int n=120;

        public void method()
        {
            System.out.println(age);
            System.out.println("我是内部的method！");
        }
    }

    public static class InnerClass1{
        public void method()
        {
            System.out.println("我是成员静态内部类的method方法！");
        }
        public static void method1()
        {
            System.out.println("我是成员静态内部类的静态method方法！！");
        }

    }

    public void method()
    {
        System.out.println("我是外部的method！");

        InnerClass inner=new InnerClass();
        inner.method();

    }
}
