package com.itheima.objectOutputStream06;

import java.io.*;
/*
* 对象的序列化和反序列化，主要是通过ObjectOutputStream（序列化）ObjectInputStream(反序列化）来实现的，类似的创建对象需要传入一个OutputStream或者InputStream
*对线来实现的，所能序列化的对象需要实现 Serializable接口。同时为了避免对象中一些重要数据泄漏，可以通过使用transient关键字来选择避免序列化。
* */
public class Demo01 {
    public static void main(String[] args) throws Exception{
        //创建一个序列化对象
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("day13_IO03/resource/e.txt"));
        //调用序列化对象的方法writeObject();
        objectOutputStream.writeObject(new Student("zhangsan","123"));
        //关闭序列化流
        objectOutputStream.close();
        //创建一个反序列化对象，用于将文件中序列化的对象解析出来。
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("day13_IO03/resource/e.txt"));
       //通过readObject()方法来实现
        Student student = (Student) objectInputStream.readObject();
        System.out.println(student);
        objectInputStream.close();

    }
}
//所能序列化的对象的类需要实现Serializable接口
class Student implements Serializable{
    private String name;
    private transient String pws;

    public Student() {
    }

    public Student(String name, String pws) {
        this.name = name;
        this.pws = pws;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", pws='" + pws + '\'' +
                '}';
    }
}
