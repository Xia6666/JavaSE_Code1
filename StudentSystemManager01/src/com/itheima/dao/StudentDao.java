package com.itheima.dao;
import com.itheima.pojo.Student;

import java.util.LinkedList;
public class StudentDao {
  private static final   LinkedList<Student> linkedList=new LinkedList<>();
  static
  {
  linkedList.add(new Student("夏全恩","男",525,22));
  linkedList.add(new Student("王亚楠","女",530,22));
  }
    public LinkedList<Student> queryAllStudent()
    {
        return linkedList;
    }
    public int selectStudentName(String name)
    {
        for (int i = 0; i < linkedList.size(); i++) {
            if(linkedList.get(i).getName().equals(name))
            {
                return i;
            }
        }
        return -1;
    }
    public void addStudent(Student student) {
        linkedList.add(student);
    }

    public void setStudent(int index, Student student) {
        linkedList.set(index,student);
    }

    public void removeStudent(int index) {
        linkedList.remove(index);
    }
}
