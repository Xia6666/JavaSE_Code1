package com.itheima.stream01.test01;

import java.util.Arrays;
import java.util.Comparator;

public class Test02 {
    public static void main(String[] args) {
        String[] arr = {"柳岩,36,女,石景山区","杨幂,35,女,朝阳区","大鹏,37,男,搜狐大厦"};

        //需求: 将arr中年龄先排序,排序后的内容截取前两个,然后将剩下的数据封装转换成一个一个的Person对象,并遍历打印
                Arrays.stream(arr).sorted((String o1, String o2) -> o1.split(",")[1].compareTo(o2.split(",")[1])
                ).limit(2).map(
                s -> new Person(s.split(",")[0],
                        Integer.parseInt(s.split(",")[1]),
                        s.split(",")[2],
                        s.split(",")[3])).forEach(System.out::println);
    }
}

class Person {
    private String name;
    private int age;
    private String gender;
    private String address;

    public Person() {
    }

    public Person(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}