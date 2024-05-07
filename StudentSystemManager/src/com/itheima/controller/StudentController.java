package com.itheima.controller;

import com.itheima.pojo.Student;
import com.itheima.service.StudentService;

import java.util.Scanner;

public class StudentController {
    private final Scanner scanner=new Scanner(System.in);

    private static final StudentService studentService=new StudentService();

    public void start()
    {

        while (true){
            System.out.println("======================");
            System.out.println("1,添加学生");
            System.out.println("2,修改学生");
            System.out.println("3,删除学生");
            System.out.println("4,查看学生");
            System.out.println("5,退出系统");

            System.out.println("请选择：");
            int n = scanner.nextInt();

            switch (n) {
                case 1:
                   addStudent();
                    break;
                case 2:
                    setStudent();
                    break;
                case 3:
                   System.out.print("请输入你要删除的学生姓名：");
                    String name2 = scanner.next();
                    boolean b = studentService.removeStudents(name2);
                    System.out.println(b?"删除成功！":"没有找到该学生，删除失败！！！");
                    break;
                case 4:
                  selectAll();
                    break;
                case 5:
                    System.out.println("成功退出系统！");
                    return;

            }

        }

    }
    public void addStudent()
   {
       System.out.print("学生姓名：");
       String name = scanner.next();
       boolean nameExit = studentService.getNameExit(name);
       if(nameExit)
       {
           System.out.println("该用户已经存在，添加失败！请重新输入！");
           addStudent();
       }
       System.out.print("学生性别：");
       String sex=scanner.next();

       System.out.print("学生学号：");
       String id=scanner.next();


       System.out.print("学生分数：");
       double score = scanner.nextDouble();

       System.out.print("学生年龄：");
       int age=scanner.nextInt();

       Student student = new Student(name, sex, id, score, age);
       studentService.addStudents(student);
       System.out.println("添加成功");

   }

    private void setStudent() {
        System.out.print("请输入要修改的学生姓名：");
        String name1 = scanner.next();

       for (int j = 0; j < studentService.getStudentsList().size(); j++)
        {
            if(studentService.getStudentsList().get(j).getName().equals(name1))
            {
                System.out.print("修改后的学生姓名：");
                String name = scanner.next();

                System.out.print("修改后的学生性别：");
                String sex=scanner.next();

                System.out.print("修改后的学生学号：");
                String id=scanner.next();

                System.out.print("修改后的学生分数：");
                double score = scanner.nextDouble();

                System.out.print("修改后的学生年龄：");
                int age=scanner.nextInt();


                studentService.setStudents(j,new Student(name,sex,id,score,age));
                System.out.println("修改成功！");
                return;
            }
        }
            System.out.println("修改失败!!!没有找到该学生！");
            System.out.println("请重新输入");
            setStudent();
    }


    private void selectAll()
    {
        boolean flag=false;
        for (int i = 0; i < studentService.getStudentsList().size(); i++) {
            if(studentService.getStudentsList().get(i)!=null)
            {
                flag=true;
                break;
            }
        }

        if(!flag)
        {
            System.out.println("暂无数据，请添加学生信息！");
            return;
        }

        System.out.println("学生姓名\t\t学生性别\t\t学生的学号\t\t学生的分数\t\t学生的年龄\t");

        for (int i1 = 0; i1 < studentService.getStudentsList().size(); i1++) {
            System.out.print(studentService.getStudentsList().get(i1).getName()+"\t\t\t");
            System.out.print(studentService.getStudentsList().get(i1).getSex()+"\t\t\t");
            System.out.print(studentService.getStudentsList().get(i1).getId()+"\t\t");
            System.out.print(studentService.getStudentsList().get(i1).getScore()+"\t\t\t\t");
            System.out.println(studentService.getStudentsList().get(i1).getAge()+"\t");
           // System.out.println("=======end=======");
        }

    }


}
