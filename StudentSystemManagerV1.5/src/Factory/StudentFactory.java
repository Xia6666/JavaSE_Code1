package Factory;

import dao.BasicsStudentDao;
import dao.StudentDao;

public class StudentFactory {
    private StudentFactory(){}
    public static BasicsStudentDao getStudentDao()
    {

        return new StudentDao();
    }
}
