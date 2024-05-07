package com.itheima.map01.test01;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;

public class Test01 {
    public static void main(String[] args) {

        Map<Student,String> hashMap=new HashMap<>();

        hashMap.put(new Student("dapang",22),"北京");
        hashMap.put(new Student("xiaomei",23),"天津");

        hashMap.forEach((s1,s2)-> System.out.println(s1+"----"+s2));


        hashMap.keySet().stream().filter(new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return student.getName().equals("dapang") ;
            }
        }).forEach(student -> System.out.println(student+"----"+hashMap.get(student)));

    }
}

class Student
{
    private String name;
    private int age;

    public Student() {
    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return Double.compare(age, student.age) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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

    public double getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
