package com.itheima;
import com.itheima.controller.StudentController;
import com.itheima.controller.UserController;

public class StudentApplication
{
    public static void main(String[] args) {
       /* UserController userController = new UserController();
        userController.start();
*/
        StudentController studentController = new StudentController();
        studentController.start();


    }
}



