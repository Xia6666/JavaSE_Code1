package com.itheima.compare02.test01;

import java.util.TreeSet;

/**
 * 有3个学生信息，属性为(姓名,语文成绩,数学成绩,英语成绩)
 * 按照总分从低到高输出到控制台
 * 总分相同,根据语文成绩升序排列
 * 语文相同,根据数学降序排列
 * 数学相同,再根据姓名降序排列
 */
public class Test {
    public static void main(String[] args) {
        TreeSet<Student> students=new TreeSet<>();
        students.add(new Student("张三",120,125,110));
        students.add(new Student("李四",110,100,130));
        students.add(new Student("王五",125,125,110));
        students.add(new Student("赵六",90,145,105));
        students.add(new Student("夏一",150,150,150));

        students.forEach(System.out::println);
    }
}

class Student implements Comparable<Student>{
    private String name;
    private Double Chinese;
    private Double Math;
    private Double English;
    private Double score;
    @Override
    public int compareTo(Student o) {
        /*int res= (int) (this.score-o.score);
        if(res==0)
        {
            if(this.Chinese-o.Chinese==0)
            {
                if(o.Math-this.Math==0)
                {
                    return o.name.compareTo(this.name);
                }
                else return (int) (o.Math-this.Math);
            }
            else
                return (int) (this.Chinese-o.Chinese);

        }
        else
            return res;*/
        int result=this.score.compareTo(o.score);
        result= result==0?this.Chinese.compareTo(o.Chinese):result;
        result= result==0?o.Math.compareTo(this.Math):result;
        result= result==0?o.name.compareTo(this.name):result;
        return result;
    }

    public Student() {
    }

    public Student(String name, double chinese, double math, double english) {
        this.name = name;
        Chinese = chinese;
        Math = math;
        English = english;
        this.score = chinese+math+english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChinese() {
        return Chinese;
    }

    public void setChinese(double chinese) {
        Chinese = chinese;
    }

    public double getMath() {
        return Math;
    }

    public void setMath(double math) {
        Math = math;
    }

    public double getEnglish() {
        return English;
    }

    public void setEnglish(double english) {
        English = english;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Chinese=" + Chinese +
                ", Math=" + Math +
                ", English=" + English +
                ", score=" + score +
                '}';
    }


}
