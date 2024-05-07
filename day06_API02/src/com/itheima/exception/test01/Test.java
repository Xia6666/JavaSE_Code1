package com.itheima.exception.test01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int n,m;
        while (true)
        {
            System.out.println("请输入第1个整数");
            try {
                Scanner scanner=new Scanner(System.in);
                n=scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("输入有误，请务必输入整数! ");
            }
        }
        while (true)
        {
            System.out.println("请输入第2个整数");
            try {
                Scanner scanner=new Scanner(System.in);
                m=scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("输入有误，请务必输入整数！");
            }
        }

        System.out.println(n+"除以"+m+"="+n/m);

    }
}
