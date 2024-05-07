package com.itheima.fileInputStream02.test01;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) throws Exception {
        FileInputStream in=new FileInputStream("day11_IO01/xia.txt");
        FileOutputStream op=new FileOutputStream("day11_IO01/quan.txt");

        //创建一个集合，用于存放学生对象
        ArrayList<Student> students=new ArrayList<>();
        //创建一个byte数组，用于存放读出来的字节数据
        byte[] bytes=new byte[1024];
        //获取读出了多长字节
        int len = in.read(bytes);
        //将读出来的字节转化为字符串
        String string = new String(bytes, 0, len);
        //将读出来的字符串按换行分割成split数组
        String[] split = string.split(System.lineSeparator());
        //对数组遍历，然后再对每个数组按“，”分割存放到集合中
        for (String s : split) {
            students.add(new Student(s.split(",")[0], s.split(",")[1], Integer.parseInt(s.split(",")[2]), s.split(",")[3]));
        }
        //对集合遍历
        students.forEach(System.out::println);

        in.close();
        op.close();

    }
}
class Student {
    private String id; // 学号
    private String name; // 姓名
    private int age; // 年龄
    private String birthday; // 生日

    public Student() {
    }

    public Student(String id, String name, int age, String birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return
                id +
                        "," + name +
                        "," + age +
                        "," + birthday
                ;
    }
}

