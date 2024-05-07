package com.itheima.dao;

import com.itheima.pojo.Student;

import java.util.ArrayList;

public class StudentDao {
    private static final  ArrayList<Student> students=new ArrayList<>();

    static {
        students.add(new Student("张三","男","071220309",525,22));
        students.add(new Student("李四","男","071220310",435,20));
        students.add(new Student("王二","女","071220311",530,23));
        students.add(new Student("赵五","男","071220312",535,21));
        students.add(new Student("钱六","女","071220315",470,25));
    }
    public ArrayList<Student> selectAll()
    {
        return students;
    }
    public void addStudents(Student student)
    {
        students.add(student);
    }
    public void removeStudents(int index)
    {
        students.remove(index);
    }

}
