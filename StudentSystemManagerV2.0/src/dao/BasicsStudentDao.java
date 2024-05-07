package dao;

import pojo.Student;

/*1,查询学生信息
2,修改学生信息
3,删除学生信息
4,添加学生信息
5,退出系统*/
public interface BasicsStudentDao {
    Student[] selectAllStudent();//查询所有学生

    int judgeStudentName(String name);//判断有无该学生,如果有就返回他的索引值，没有就返回-1

    void addStudent(Student student);//添加一个学生

    void deleteStudent(int index);//首先通过该judgeStudentName方法获取学生的索引，如果有就根据索引删除该学生

    void setStudent(int index,Student student);//通过索引修改对应学生

}
