package com.xiaqe.service;

import com.xiaqe.dao.StudentBaseDao;
import com.xiaqe.dao.StudentDao;
import com.xiaqe.pojo.Student;

public class StudentManager implements StudentBaseManager{
    private StudentBaseDao studentBaseDao=new StudentDao();

    @Override
    public Student[] selectAll() {
        return studentBaseDao.selectAll();
    }

    @Override
    public boolean isExistStudent(String ID) {
        return studentBaseDao.isExistStudent(ID);
    }

    @Override
    public boolean setStudent(String ID, String name, String sex, String birthday, Double score) {
        return studentBaseDao.setStudent(ID, name, sex, birthday, score);
    }

    @Override
    public boolean deleteStudent(String ID) {
        return studentBaseDao.deleteStudent(ID);
    }

    @Override
    public boolean addStudent(String ID, String name, String sex, String birthday, Double score) {
       return studentBaseDao.addStudent(ID, name, sex, birthday, score);
    }
}
