package dao;

import pojo.Student;

import java.util.LinkedList;

public class StudentDao implements BasicsStudentDao{
    private static final LinkedList<Student> students=new LinkedList<>();
    static{
        students.add(new Student("张三","男",525,"2002-2-10",22));
        students.add(new Student("李四","男",425,"2001-11-20",23));
        students.add(new Student("王五","女",530,"2003-1-9",21));
    }
    @Override
    public Student[] selectAllStudent() {
        Student[] students1=new Student[students.size()];
        for (int i = 0; i < students.size(); i++) {
            students1[i]=students.get(i);
        }
        return students1;
    }

    @Override
    public int judgeStudentName(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);

    }

    @Override
    public void deleteStudent(int index) {
        students.remove(index);
    }

    @Override
    public void setStudent(int index, Student student) {
        students.set(index,student);
    }
}
