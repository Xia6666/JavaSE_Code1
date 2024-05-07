package com.itheima.lambda02.demo02;

public class Test {

    public static void main(String[] args) {
        Swim swim=(hour, name) -> System.out.println(hour+"n"+name);
        swim.swimming(3,"xia");

        //1,参数类型可以省略
        //2,参数只有一个时，小括号也能省略
        //3,方法体中只有一行代码，{}和return ;也能省略


       Count count= ((a,b)-> a>b?a:b);
        System.out.println(count.max(213425, 1234253));
    }
}
