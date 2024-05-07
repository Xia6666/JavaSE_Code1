package com.heima.chenhui.code.test16;

import java.util.*;

public class StudentDemo {


    public static void main(String[] args) {
        //TreeSet<Student> treeSet=new TreeSet<>()

        //题目要求先添加再排序，所以就没用treeSet了
        ArrayList<Student> arrayList=new ArrayList<>();
        Collections.addAll(arrayList,
                new Student("张三",18,"heima001"),
                new Student("李四",18,"heima002"),
                new Student("王五",17,"heima003"));

        Collections.sort(arrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result=o2.getAge()-o1.getAge();
                result=result==0?o1.getId().compareTo(o2.getId()):result;
                return result;
            }
        });
        arrayList.forEach(s-> System.out.println(s.getName()+"的年龄是"+s.getAge()+",学号是"+ s.getId()));
    }

}
