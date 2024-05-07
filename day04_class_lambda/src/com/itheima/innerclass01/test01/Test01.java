package com.itheima.innerclass01.test01;

/*
请完善下列代码，在main方法中调用Inner的method方法，并依次在控制台输出30,20,10
运行结果
    30
    20
    10
 */

public class Test01 {
    public static void main(String[] args) {
        // 请在此处调用Inner类中的method方法
        Outer.Inner inner=new Outer().new Inner();
        inner.method();

    }
}

class Outer {
    int num = 10;
    class Inner {
        int num = 20;
        public void method(){
            int num = 30;
            // ---完善代码---
            System.out.println(num);       // 输出30
            System.out.println(this.num);       // 输出20
            System.out.println(Outer.this.num);       // 输出10
        }
    }
}