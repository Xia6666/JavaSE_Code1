package com.itheima.compare02.test02;

import java.util.TreeSet;

public class Demo02 {
    public static void main(String[] args) {

        //使用TreeSet存储数据需要给出排序规则，否则会报错。
        TreeSet<Student> treeSet=new TreeSet<>();
        treeSet.add(new Student("张三",23));
        treeSet.add(new Student("李四",23));
        treeSet.add(new Student("王五",21));
        treeSet.add(new Student("赵六",19));
        //方式一通过实现Comparable接口，

        treeSet.forEach(System.out::println);

    }
}
class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student1{" +
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

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        int result = this.age - o.age;

        return result == 0 ? this.name.compareTo(o.name) : result;


    }
}