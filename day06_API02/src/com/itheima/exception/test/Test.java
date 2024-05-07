package com.itheima.exception.test;

import java.util.Scanner;

/**
 * 键盘录入学生的姓名和年龄,其中年龄为 18 - 25岁,
 * 超出这个范围是异常数据不能赋值.需要重新录入,一直录到正确为止。
 *
 * 要求：使用   String ageStr =  sc.next();
 * 效果如下：
 * 请输入学生姓名：
 * zsan
 * 请输入学生年龄：
 * 23a
 * 年龄不合法，请重新输入：
 * 666
 * 年龄不在[18,25]范围内，请重新输入：
 * 23
 *
 * 当前学生信息为：Student{name="zsan",age=23}
 */
public class Test {
    public static void main(String[] args) {

        System.out.println(method());
    }
    public static Student method()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入学生姓名:");
        String name=scanner.next();
        System.out.println("请输入学生年龄:");
            while (true)
            {
                String age=scanner.next();
            try {
                int age1 = Integer.parseInt(age);
                if(age1>=18&&age1<=25)
                {
                    return(new Student(name,age1));
                }
                System.out.println("学生年龄不在[18,25]之间！请重新输入学生年龄：");
            }catch (Exception e)
            {
                System.err.println("年龄不合法！请重新输入学生年龄：");
            }
        }

    }
}
class Student{
    private String name;
    private int age;
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}