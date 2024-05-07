package com.itheima.extends01.test03;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("071220309", "张三", 23, "2002-02-10");
        Teacher teacher = new Teacher("071220308", "李四", 33, "1992-02-10");
        student.show();
        teacher.show();
    }
}
