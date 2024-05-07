package com.xiaqe.controller;

import com.xiaqe.service.StudentBaseManager;
import com.xiaqe.service.StudentManager;
import com.xiaqe.utils.Age;

import java.util.Scanner;

public class StudentController {
        private StudentBaseManager studentBaseManager=new StudentManager();
        private Scanner scanner=new Scanner(System.in);

        public void start()
        {
            System.out.println("=====================欢迎进入学生管理系统V2.1=====================");
            while (true){
            System.out.println("1,查询全部学生");
            System.out.println("2,根据学号添加学生");
            System.out.println("3,根据学号修改学生");
            System.out.println("4,根据学号删除学生");
            System.out.println("5,退出系统");
            System.out.println("请选择：");
            int choice;
            while (true){
                try{
                   choice=scanner.nextInt();
                   break;
                }catch (Exception e)
                {
                    System.err.println("输入不合法！！!请重新输入：");
                    choice=new Scanner(System.in).nextInt();
                }
            }
            switch (choice)
            {
                case 1:
                    selectAllStudent();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println(deleteStudent()?"删除成功！！！":"错误次数太多！！！删除失败！！！");
                    break;
                case 5:
                    System.out.println("欢迎您的访问，期待下次再见！！！");
                    System.exit(0);
                    break;
            }
            }








        }

    private void addStudent() {
        System.out.println("请输入要添加学生的学号:");
        String ID=scanner.next();
        for (int i = 2; i >0 ; i--) {
            if(!studentBaseManager.isExistStudent(ID))
            {
                System.out.println("请输入学生的姓名：");
                String name=scanner.next();
                System.out.println("请输入学生的性别：");
                String sex=scanner.next();
                System.out.println("请输入学生的生日(yyyy-MM-dd)：");
                String birthday;
                int age;
                Double score;
                while (true){
                birthday=scanner.next();

                try {
                     age=Age.getAge(birthday);
                     break;
                }catch (Exception e)
                {
                    System.err.println("生日格式不对，请重新输入：");
                }
                }
                System.out.println("请输入学生的成绩：");
                while (true){
                    try{
                       score =scanner.nextDouble();
                        break;
                    }catch (Exception e)
                    {
                        System.out.println("学生的成绩应该是Double类型，输入不合法！！");
                    }
                }

              studentBaseManager.addStudent(ID,name,sex,birthday,age,score);
                System.out.println("恭喜你添加成功！！！");
            }
        }


    }

    private boolean deleteStudent() {
        System.out.println("请输入要删除学生的学号：");
        String ID = scanner.next();
        for (int i = 2; i > 0; i--) {
            if (studentBaseManager.isExistStudent(ID)) {
                studentBaseManager.deleteStudent(ID);
                return true;
            } else {
                System.out.println("系统中没有该学号的学生！！！还有" + i + "次机会，请重新输入：");
                ID = scanner.next();
            }
        }
        return false;
    }



    private void selectAllStudent() {
        for (int i = 0; i < studentBaseManager.selectAll().length; i++) {
            System.out.println(studentBaseManager.selectAll()[i]);
        }
    }


}
