package com.itheima.api01.test01;
import java.util.ArrayList;
/*
某公司发放年终礼品，但hr在统计的时候发现有很多同姓名同年龄的员工，
所以决定对这一部分员工，发放【缘分大礼包】，其余员工发放【普通大礼包】，
请用技术手段，完成礼品的分发。

现有4个员工信息：
    张三，23
    李四，24
    张三，23
    张三，28
运行结果：
    Employee{name=张三,age=23}获得了缘分大礼包
    Employee{name=李四,age=24}获得了普通大礼包
    Employee{name=张三,age=23}获得了缘分大礼包
    Employee{name=张三,age=28}获得了普通大礼包
 */
public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee(" 张三", 23);
        Employee employee2 = new Employee(" 李四", 24);
        Employee employee3 = new Employee(" 张三", 23);
        Employee employee4 = new Employee(" 张三", 28);

        ArrayList<Employee> employeeArrayList=new ArrayList<>();
        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);
        employeeArrayList.add(employee4);

        for (int i = 0; i < employeeArrayList.size(); i++) {
            boolean flag=true;
            for(int j=0;j<employeeArrayList.size();j++)
            {
               if(employeeArrayList.get(i).equals(employeeArrayList.get(j))&&i!=j)
               {
                   System.out.println(employeeArrayList.get(i)+"获得了缘分大礼包");
                   flag=false;
                   break;
               }

            }
            if(flag)
                System.out.println(employeeArrayList.get(i)+"获得了普通大礼包");
        }
    }
}
