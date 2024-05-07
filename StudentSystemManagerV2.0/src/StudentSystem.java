import controller.HashMapUserController;
import controller.StudentController;

public class StudentSystem {
    public static void main(String[] args) {

      /*  UserController userController=new UserController();
        userController.start();*/

        HashMapUserController hashMapUserController=new HashMapUserController();
        hashMapUserController.start();

        StudentController studentController=new StudentController();
        studentController.start();
    }
}
