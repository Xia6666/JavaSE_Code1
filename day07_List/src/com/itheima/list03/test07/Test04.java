package com.itheima.list03.test07;

import java.util.Collections;
import java.util.TreeSet;

public class Test04 {
    public static void main(String[] args) {
        TreeSet<Student> students=new TreeSet<>();
        Collections.addAll(students,
                new Student("马冬梅",92,87,93),
                new Student("夏洛",79,97,81),
                new Student("袁华",97,93,94),
                new Student("大春",85,88,91),
                new Student("秋雅",95,90,99));
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
class Student implements Comparable<Student>
{
        private String name;
        private Integer chinese;
        private Integer math;
        private Integer english;
        private Integer score;

    public Student() {
    }

    public Student(String name, Integer chinese, Integer math, Integer english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
        this.score=chinese+math+english;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getChinese() {
        return chinese;
    }

    public void setChinese(Integer chinese) {
        this.chinese = chinese;
    }

    public Integer getMath() {
        return math;
    }

    public void setMath(Integer math) {
        this.math = math;
    }

    public Integer getEnglish() {
        return english;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        int result=o.score-this.score;
        result= result==0?o.chinese-this.chinese:result;
        return result;
    }
}
