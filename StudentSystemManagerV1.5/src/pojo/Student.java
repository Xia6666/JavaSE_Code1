package pojo;

import java.util.Objects;

public class Student {
    private String name;
    private String sex;
    private double score;
    private String birthday;
    private int age;

    public Student(String name, String sex, double score, String birthday, int age) {
        this.name = name;
        this.sex = sex;
        this.score = score;
        this.birthday = birthday;
        this.age = age;
    }

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return Double.compare(score, student.score) == 0 && age == student.age && Objects.equals(name, student.name) && Objects.equals(sex, student.sex) && Objects.equals(birthday, student.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, score, birthday, age);
    }

    @Override
    public String toString() {
        return
                "学生姓名='" + name + '\'' +
                ", 性别='" + sex + '\'' +
                ", 分数=" + score +
                ", 生日='" + birthday + '\'' +
                ", 年龄=" + age
                ;
    }
}
