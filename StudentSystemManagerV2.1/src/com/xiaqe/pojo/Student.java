package com.xiaqe.pojo;

import com.xiaqe.utils.Age;

import java.util.Objects;

public class Student implements Comparable<Student>{

    private String ID;
    private String name;
    private String sex;
    private String birthday;
    private Integer age;
    private Double score;


    public Student() {
    }

/*    public Student(String ID, String name, String sex, String birthday, Double score) {
        this.ID = ID;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.age= Age.getAge(birthday);
        this.score = score;
    }*/
    public Student(String ID, String name, String sex, String birthday,Integer age, Double score) {
        this.ID = ID;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.age= age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return Objects.equals(ID, student.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public String toString() {
        return ID+","+name+","+sex+","+birthday+","+score;
    }

    @Override
    public int compareTo(Student o) {
       int result=o.score.compareTo(this.score);
      result=result==0?this.ID.compareTo(o.ID):result;
      return result;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
