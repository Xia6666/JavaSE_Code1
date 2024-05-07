package com.itheima.service;

import com.itheima.dao.StudentDao;
import com.itheima.pojo.Student;

import java.util.LinkedList;

public class StudentService {

    private final StudentDao studentDao=new StudentDao();
    public LinkedList<Student> queryAllStudent() {
        return studentDao.queryAllStudent();
    }

    public int isExistName(String name)
    {
       return studentDao.selectStudentName(name);
    }
    public void addStudent(Student student)
    {
        studentDao.addStudent(student);
    }

    public void setStudent(int index,Student student) {
        studentDao.setStudent(index,student);
    }

    public void removeStudent(int n) {
        studentDao.removeStudent(n);
    }
}
