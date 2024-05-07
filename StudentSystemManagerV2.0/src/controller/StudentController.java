package controller;

import pojo.Student;
import service.StudentManager;
import utils.DateUtils;

import java.util.Scanner;

public class StudentController {
    private final StudentManager studentManager=new StudentManager();
    private final Scanner scanner=new Scanner(System.in);

    public void start()
    {
        System.out.println("====================欢迎进入学生管理系统====================");
             while (true) {
            System.out.println("1,查询学生信息");
            System.out.println("2,修改学生信息");
            System.out.println("3,删除学生信息");
            System.out.println("4,添加学生信息");
            System.out.println("5,退出系统");
            System.out.println("请选择：");
            label:  while (true) {
                int choice;
                while (true)            //处理用户输入的不是整数的异常！
                {
                    try {
                        Scanner scanner1 = new Scanner(System.in);
                        choice = scanner1.nextInt();
                        break;
                    } catch (Exception e) {
                        System.err.println("输入不合法！请重新输入一个整数：");
                    }
                }
                switch (choice) {
                    case 1:
                        selectAllStudent();
                        break label;
                    case 2:
                        setStudent();
                        break label;
                    case 3:
                        deleteStudent();
                        break label;
                    case 4:
                        addStudent();
                        break label;
                    case 5:
                        System.out.println("欢迎你的使用！！！");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("输入的整数不在[1,5]之间，请重新输入：");
                }
            }
        }
    }

    private void setStudent() {
        System.out.println("请输入修改学生的姓名：");
        while (true) {
            String name = scanner.next();
            if (studentManager.judgeStudentName(name) != -1) {
                System.out.println("请输入你要修改的学生的性别：");
                String sex = scanner.next();
                System.out.println("请输入你要修改的学生的分数：");
                double score;
                while (true)            //处理用户输入的不合法的异常！
                {
                    try {
                        Scanner scanner1 = new Scanner(System.in);
                        score = scanner1.nextDouble();
                        break;
                    } catch (Exception e) {
                        System.err.println("输入不合法！请重新输入一个分数：");
                    }
                }
                System.out.println("请输入你要修改的学生的生日（2002-2-10）：");
                while (true) {
                    String birthday = scanner.next();
                    int age = DateUtils.getAge(birthday);
                    if (age != -1) {
                        studentManager.setStudent(studentManager.judgeStudentName(name), new Student(name, sex, score, birthday, age));
                        System.out.println(name + "同学修改成功！");
                        return;
                    }
                }
            }
            System.out.println("要修改的同学不存在！请重新输入：");
        }
    }

    private void addStudent() {

        System.out.println("请输入你要添加的学生的姓名：");
        while (true)
        {
        String name=scanner.next();
        if (studentManager.judgeStudentName(name)==-1) {
            System.out.println("请输入你要添加的学生的性别：");
            String sex=scanner.next();
            System.out.println("请输入你要添加的学生的分数：");
            double score=scanner.nextDouble();
            System.out.println("请输入你要添加的学生的生日（2002-2-10）：");
            while (true) {
                String birthday = scanner.next();
                int age = DateUtils.getAge(birthday);
                if (age != -1) {
                    studentManager.addStudent(new Student(name, sex, score, birthday, age));
                    System.out.println(name+"同学添加成功！");
                    return;
                }
            }
        }
        else System.out.println("该学生已经存在了！请重新输入：");
        }

    }

    private void deleteStudent() {
        System.out.println("请输入你想删除学生的名字：");
        while (true) {
            String name = scanner.next();
            if (studentManager.deleteStudent(name)) {
                System.out.println("学生" + name + "删除成功！");
                return;
            }
            System.out.println("系统中没有"+name+",删除失败！请重新输入要删除学生的名字：");
        }
    }

    private void selectAllStudent() {
        Student[] students = studentManager.selectAllStudent();
        if(students!=null)
        {
            for (Student student : students) {
                System.out.println(student);
            }
        }
        else
            System.out.println("系统中暂无数据，请添加：");

    }






}
