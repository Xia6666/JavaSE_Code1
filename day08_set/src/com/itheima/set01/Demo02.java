package com.itheima.set01;

import java.util.Objects;

public class Demo02 {
    public static void main(String[] args) {
        String s1="itcast";
        int code1 = s1.hashCode();      //使用Object类中的hashcode，是通过地址进行计算的
        System.out.println(code1);
                                        //Student类中重写的hashCode方法后，就可以根据属性值计算hash值，所以i和i1的哈希值相等
        Student student=new Student("张三",23);
        Student student1=new Student("张三",23);
        int i = student.hashCode();
        int i1 = student1.hashCode();
        System.out.println(i);
        System.out.println(i1);

    }
}
//使用hashSet存储自定义对象，要想不重复，必须重写equals和hashCode方法

class  Student{
  private String name;
  private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}