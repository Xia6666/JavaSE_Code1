package com.xiaqe.dao;

import com.xiaqe.pojo.Student;

import java.util.ArrayList;

public interface StudentBaseDao {
    //查询全部学生的信息
    Student[] selectAll();

    //根据学号判断学生是否存在
    boolean isExistStudent(String ID);

    //根据学号修改学生信息
    boolean setStudent(String ID,String name,String sex,String birthday,Integer age,Double score);

    //根据学号删除学生信息
    boolean deleteStudent(String ID);

    //根据学号添加学生信息
    boolean addStudent(String ID,String name,String sex,String birthday,Integer age,Double score);

}
