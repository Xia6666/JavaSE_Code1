package com.itheima.set01;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;

public class Demo03 {
    public static void main(String[] args) {

        HashSet<Employee> employees=new HashSet<>();
        Employee e1 = new Employee("张三",6000);
        Employee e2 = new Employee("李四",8000);
        Employee e3 = new Employee("李四",8000);
        Employee e4 = new Employee("王五",8000);

        //需求1： 使用HashSet存储上述员工对象，要求：姓名和工资相同的对象在集合中只保留一个

        Collections.addAll(employees,e1,e2,e3,e4);
        System.out.println(employees);

    }
}
class Employee{
    private String name;
    private double salary;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
