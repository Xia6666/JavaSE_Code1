package com.itheima.lambda02.test01;

/**
 * @author 陈辉
 * @data 2024 15:58
 */

public class Test01 {
    public static void main(String[] args) {
        //要求：创建测试类完成一下函数式接口匿名内部类使用和Lambda最简格式编写。
        InterA interA=new InterA() {
            @Override
            public void show() {
                System.out.println("这是匿名内部类的InterA");
            }
        };
        interA.show();

        InterA interA1=()-> System.out.println("这是lambda的InterA");
        interA1.show();

        InterB interB=new InterB() {
            @Override
            public void method(int num) {
                System.out.println("通过匿名内部类得到这个数是："+num);
            }
        };
        interB.method(10000);

        InterB interB1=num -> System.out.println("通过lambda得到这个数是: "+num);
        interB1.method(10000);

        InterC interC =new InterC() {
            @Override
            public String function() {
                return "你好匿名内部类";
            }
        };
        System.out.println(interC.function());

        InterC interC1=()->"你好lambda";
        System.out.println(interC1.function());


        InterD interD=new InterD() {
            @Override
            public int niubility() {
                return 10000;
            }
        };
        System.out.println("匿名内部类："+interD.niubility());

        InterD interD1=()->10000;
        System.out.println("lambda："+interD1.niubility());

    }
}
