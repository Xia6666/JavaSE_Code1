package com.itheima.package_01;
/*
* 包的注意事项：
*       1，一个类中最多只有一个package定义包的语句
*       2，package上面不能有其它任意代码
*       3，package    import     class
*
* 导包的注意事项：
*       1，可以通过import关键字导包 --全局设定
*       2，还有通过全类名（包名.类名）导包 com.itheima.package_02.Student
*       2，同一个包下的类直接访问，不需要导包
* */

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 本包下的类可以不用导包
        Student stu1 = new Student();

        //调用其它包中的同名类需要用到全类名
        com.itheima.package_02.Student stu2=new com.itheima.package_02.Student();



    }

}
