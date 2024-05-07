package service;

import dao.StudentDao;
import pojo.Student;

public class StudentManager {
    private final StudentDao studentDao=new StudentDao();
    public Student[] selectAllStudent() {
        return studentDao.selectAllStudent();
    }

    public int judgeStudentName(String name)
    {
        return studentDao.judgeStudentName(name);
    }

    public boolean deleteStudent(String name)
    {
        if(studentDao.judgeStudentName(name)!=-1)
        {
            studentDao.deleteStudent(studentDao.judgeStudentName(name));
            return true;
        }
        return false;
    }

    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    public void setStudent(int index, Student student) {
        studentDao.setStudent(index,student);
    }
}

