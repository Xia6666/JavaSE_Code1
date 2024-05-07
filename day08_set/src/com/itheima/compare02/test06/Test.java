package com.itheima.compare02.test06;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
      // TreeSet<Book> bookSet=new TreeSet<>();
        TreeSet<Book> bookSet=new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                int result = o1.getMoney()- o2.getMoney();
                result= result==0?o1.getName().compareTo(o2.getName()):result;
                return result;
            }
        });
        Scanner scanner=new Scanner(System.in);
        int i=1,j=1;
        while (i==1)
        {
            System.out.println("请输入第"+j+"本书的名称：");
            String name=scanner.next();
            System.out.println("请输入第"+j+"本书的价格：");
            int price=scanner.nextInt();
            bookSet.add(new Book(name, price));
            System.out.println("添加"+name+"书已经成功，继续添加请输入1，输入其它数字将结束！");
            i=scanner.nextInt();
            j++;
        }
        System.out.println("你一共添加了"+j+"本书分别是：");
        bookSet.forEach(System.out::println);
    }
}
