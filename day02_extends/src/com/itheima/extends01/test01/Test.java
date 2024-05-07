package com.itheima.extends01.test01;

public class Test {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("张三",34);
        /*teacher.setName("张三");
        teacher.setAge(34);*/
        teacher.show();

        Student student=new Student();
        student.setName("李四");
        student.setAge(14);
        student.show();



    }

}
