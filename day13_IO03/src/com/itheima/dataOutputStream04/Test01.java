package com.itheima.dataOutputStream04;

import java.io.*;

public class Test01 {
    public static void main(String[] args) throws Exception{
        //首先通过数据流将数据及其类型存放到文件中，再通过数据文件输入流将数据文件读出来，封装到Student对象中，再通过序列化学生对象存放到文件中
        //再通过返序列化将学生对象从文件中读出来，打印出来
        //DataOutputStream(new FileOutputStream())
        //DataInputStream(new FileInputStream())
        //ObjectOutputStream(new FileOutputStream())
        //ObjectOutputStream(new FileInputStream())


        DataOutputStream dataOutputStream=new DataOutputStream(new FileOutputStream("day13_IO03/resource/h.txt"));
        dataOutputStream.writeUTF("张三");
        dataOutputStream.writeInt(23);
        dataOutputStream.writeUTF("男");
        dataOutputStream.writeDouble(525.0);
        dataOutputStream.close();

        DataInputStream dataInputStream=new DataInputStream(new FileInputStream("day13_IO03/resource/h.txt"));
        Student student = new Student(dataInputStream.readUTF(), dataInputStream.readInt(), dataInputStream.readUTF(), dataInputStream.readDouble());
        dataInputStream.close();

        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("day13_IO03/resource/j.txt"));
        objectOutputStream.writeObject(student);
        objectOutputStream.close();

        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("day13_IO03/resource/j.txt"));
        Student student1 = (Student) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(student1);


    }
}
class Student implements Serializable{
    private String name;
    private int age;
    private String sex;
    private double sore;


    public Student() {
    }

    public Student(String name, int age, String sex, double sore) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.sore = sore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", sore=" + sore +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getSore() {
        return sore;
    }

    public void setSore(double sore) {
        this.sore = sore;
    }
}
