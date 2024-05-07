package com.itheima.fileOutputStream01.test01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;

public class Test01 {
    public static void main(String[] args) throws Exception {
        ArrayList<Student> stus = new ArrayList<>();
        Collections.addAll(stus,new Student("heima001","张三",23,"1993-11-11")
                ,new Student("heima002","李四",24,"1994-11-11")
                ,new Student("heima003","王五",25,"1995-11-11"));

        //需求1：使用字节输出流，将stus中的学生信息按指定格式写到当前模块下的stu.txt文件中。
        //指定格式：heima001,张三,23,1993-11-11 ，每个学生信息独占一行。
        FileOutputStream fileOutputStream=new FileOutputStream("day11_IO01/xia.txt");

        fileOutputStream.write(stus.get(0).toString().getBytes());
        fileOutputStream.write(System.lineSeparator().getBytes());

        fileOutputStream.write(stus.get(1).toString().getBytes());
        fileOutputStream.write(System.lineSeparator().getBytes());

        fileOutputStream.write(stus.get(2).toString().getBytes());
        fileOutputStream.write(System.lineSeparator().getBytes());

        fileOutputStream.close();

    }
}

class Student {
    private String id; // 学号
    private String name; // 姓名
    private int age; // 年龄
    private String birthday; // 生日

    public Student() {
    }

    public Student(String id, String name, int age, String birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return
                id +
                "," + name +
                "," + age +
                "," + birthday
                ;
    }
}