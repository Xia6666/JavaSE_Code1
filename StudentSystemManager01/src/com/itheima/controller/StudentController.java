package com.itheima.controller;

import com.itheima.pojo.Student;
import com.itheima.service.StudentService;

import java.util.LinkedList;
import java.util.Scanner;

public class StudentController {
Scanner scanner = new Scanner(System.in);
StudentService studentService =new StudentService();
    public void start()
    {
        System.out.println("=======欢迎进入学生管理系统=====");
        while (true)
        {
        System.out.println("1,查询学生信息");
        System.out.println("2,修改学生信息");
        System.out.println("3,删除学生信息");
        System.out.println("4,添加学生信息");
        System.out.println("5,退出系统");

        System.out.print("请选择：");
        int n = scanner.nextInt();
        switch (n)
            {
            case 1:
                queryAllStudent();
                break;
            case 2:
                setStudent();
                break;
            case 3:
                removeStudent();
                break;
            case 4:
                addStudent();
                break;
            case 5:
                System.exit(0);
                System.out.println("欢迎下次再见！！！");
                break;
            }
        }

    }

    private void removeStudent() {
    System.out.print("请输入你想删除的学生姓名：");
    String name = scanner.next();
    int n=studentService.isExistName(name);
    if(n!=-1)
    {

        studentService.removeStudent(n);
        System.out.println("恭喜你删除成功！！！");
    }
    else {
        System.out.println("没有该学生，请重新输入！");
        removeStudent();
    }

}

    private void setStudent() {
        System.out.print("请输入你想修改的学生姓名：");
        String name = scanner.next();
        int n=studentService.isExistName(name);
        if(n!=-1)
        {
            studentService.setStudent(n,print(name));
            System.out.println("恭喜你修改成功！！！");
        }
        else {
            System.out.println("没有该学生，请重新输入！");
            setStudent();
        }

    }

    private void addStudent() {
        System.out.print("请输入你想添加的学生姓名：");
        String name = scanner.next();

        int n=studentService.isExistName(name);
        if(n==-1)
        {
            studentService.addStudent(print(name));
            System.out.println("恭喜你添加成功！！！");
        }
        else {
            System.out.println("姓名重复，请重新输入！");
            addStudent();
        }

    }

    private void queryAllStudent() {
        LinkedList<Student> students = studentService.queryAllStudent();
        for (Student student : students) {
            if (student.getName().isEmpty()) {
                System.out.println("该系统中暂时没有任何数据！请添加！！！");
                return;
            }
        }
        System.out.println("学生姓名\t\t学生性别\t\t学生成绩\t\t学生年龄\t");
        for (Student student : students) {
            System.out.println(student.getName() + "\t\t" + student.getSex() + "\t\t\t" + student.getScore() + "\t\t" + student.getSex());
        }

        System.out.println("=======================end=======================");
    }

    private Student print(String name)
    {
        System.out.print("请输入学生的性别：");
        String sex = scanner.next();
        System.out.print("请输入学生的分数：");
        double score = scanner.nextDouble();
        System.out.print("请输入学生的年龄：");
        int age = scanner.nextInt();

        return new Student(name,sex,score,age);
    }



}

