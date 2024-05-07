package com.itheima.exception.test02;

import java.util.Scanner;

public class Method {
    private Method(){}

    public static int getInt()
    {
        while (true)
        {
            System.out.println("请输入第1个整数");
            try {
                Scanner scanner=new Scanner(System.in);
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("输入有误，请务必输入整数! ");
            }
        }

    }

    public static double getDouble()
    {
        while (true)
        {
            System.out.println("请输入第2个小数");
            try {
                Scanner scanner=new Scanner(System.in);
                return scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("输入有误，请务必输入小数! ");
            }
        }
    }
    public static String getString()
    {
        while (true)
        {
            System.out.println("请输入一句话");
            try {
                Scanner scanner=new Scanner(System.in);
                return scanner.next();
            } catch (Exception e) {
                System.out.println("输入有误，请务必输入字符串! ");
            }
        }
    }


}
