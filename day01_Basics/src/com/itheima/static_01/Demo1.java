package com.itheima.static_01;

public class Demo1 {
    public static void main(String[] args) {
        Student.School="黑马程序员";

        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(23);
        stu1.setSchool("chuangzi");
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        System.out.println(stu1.getSchool());


        Student stu2 = new Student("李四", 24);
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());
        System.out.println(stu2.getSchool());


    }
}
