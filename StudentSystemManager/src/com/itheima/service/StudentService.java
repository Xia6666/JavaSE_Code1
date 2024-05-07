package com.itheima.service;

import com.itheima.dao.StudentDao;
import com.itheima.pojo.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    private final StudentDao studentDao=new StudentDao();

    public ArrayList<Student> getStudentsList()
    {
        return studentDao.selectAll();
    }

    public boolean getNameExit(String name)
    {
        for (int i = 0; i < getStudentsList().size(); i++) {
            if(getStudentsList().get(i).getName().equals(name))
            {
                return true;
            }
        }
        return false;
    }



    public void addStudents(Student student) {

            studentDao.addStudents(student);

    }
    public void setStudents(int index,Student student)
    {
        studentDao.selectAll().set(index,student);

    }
    public boolean removeStudents(String name)
    {
        boolean flag=false;
        for (int i = 0; i < studentDao.selectAll().size(); i++) {
            if (studentDao.selectAll().get(i).getName().equals(name)) {
                studentDao.removeStudents(i);
                flag=true;
                return flag;
            }
        }
        return flag;

    }
}
