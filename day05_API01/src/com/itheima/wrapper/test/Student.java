package com.itheima.wrapper.test;

import java.util.Scanner;

public class Student {
    private String name;
    private Integer age;
    private Double score;

    public Student() {
    }

    public Student(String name, Integer age, Double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入学生的姓名：");
        String name=scanner.next();
        System.out.println("请输入学生的年龄：");
        String age;
        while (true)
        {
            age=scanner.next();
            if(Integer.parseInt(age)>=18)
                break;
            else
                System.out.println("年龄不符，请重新输入！");
        }

        System.out.println("请输入学生的分数：");
        String score=scanner.next();

        Student student = new Student(name, Integer.valueOf(age), Double.valueOf(score));
        System.out.println(student);


    }

}
