package com.xiaqe.dao;

import com.xiaqe.pojo.Student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.TreeSet;

public class StudentDao implements StudentBaseDao{
    public static TreeSet<Student> treeSet=new TreeSet<>();
    static {
        System.out.println("学生信息加载中。。。。。");
        readStudent();
        System.out.println("学生信息加载完毕。。。。");

    }

    @Override
    public Student[] selectAll() {
        Student[] students=new Student[treeSet.size()];
        int index=0;
        for (Student student : treeSet) {
            students[index]=student;
            index++;
        }
        return students ;
    }

    @Override
    public boolean isExistStudent(String ID) {
        for (Student student : treeSet) {
           if(student.getID().equals(ID))
               return true;
        }
        return false;
    }

    @Override
    public boolean setStudent(String ID,String name,String sex,String birthday,Integer age,Double score) {
        for (Student student1 : treeSet) {
            if (student1.getID().equals(ID)) {
                treeSet.add(new Student(ID,name,sex,birthday,age,score));
                writeStudent();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteStudent(String ID) {
        for (Student student : treeSet) {
            if (student.getID().equals(ID)) {
                treeSet.remove(student);
                writeStudent();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addStudent(String ID,String name,String sex,String birthday,Integer age,Double score) {
        treeSet.add(new Student(ID,name,sex,birthday,age,score));
        writeStudent();
         return true;
    }

    private static void readStudent() {
        try(FileInputStream in = new FileInputStream("StudentSystemManagerV2.1/resource/student.txt"))
        {
            byte[] bytes=new byte[1024*1024*8];
            int len = in.read(bytes);
            String s=new String(bytes,0,len);
            String[] split = s.split(System.lineSeparator());
            for (String string : split) {
                String[] split1 = string.split(",");
                treeSet.add(new Student(split1[0],split1[1],split1[2],split1[3],Integer.parseInt(split1[4]),Double.parseDouble(split1[5]))) ;
            }

        }catch (Exception e)
        {
            System.err.println(e.getMessage());
        }

    }

    private static void writeStudent()
    {
        try(FileOutputStream op=new FileOutputStream("StudentSystemManagerV2.1/resource/student.txt"))
        {
            for (Student student : treeSet) {
                op.write(student.toString().getBytes(StandardCharsets.UTF_8));
                op.write(System.lineSeparator().getBytes(StandardCharsets.UTF_8));
            }
        }catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
}
