package com.itheima.list03.test03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        Collection<Student> students =new LinkedList<>();
        //   ,
        students.add(new Student("张三",22));
        students.add(new Student("李四",26));
        students.add(new Student( "张翠山",38));
        students.add(new Student("赵六",19));
        students.add(new Student("张三丰",103 ));
        students.add(new Student("张无忌",17));
        students.add(new Student("赵敏",16 ));

        System.out.print("[");
        for (Student student : students) {
            if(student.getName().contains("张")&& student.getAge()>18)
            {
                System.out.print(student+" ");
            }

        }
        System.out.println("]");

    }
}
