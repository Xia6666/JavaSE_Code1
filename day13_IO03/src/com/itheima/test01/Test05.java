package com.itheima.test01;

import java.io.*;

public class Test05 {
    public static void main(String[] args) {
        try(    ObjectOutputStream op=new ObjectOutputStream(new FileOutputStream("day13_IO03/resource/f.txt"));
                ObjectInputStream oi=new ObjectInputStream(new FileInputStream("day13_IO03/resource/f.txt"))
             )
        {
            op.writeObject(new Student("zhangsan","12345"));

            Student o = (Student) oi.readObject();
            System.out.println(o);

        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
class Student implements Serializable {
    private String name;
    private transient String pws;

    public Student() {
    }

    public Student(String name, String pws) {
        this.name = name;
        this.pws = pws;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", pws='" + pws + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPws() {
        return pws;
    }

    public void setPws(String pws) {
        this.pws = pws;
    }
}