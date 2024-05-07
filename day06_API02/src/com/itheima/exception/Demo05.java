package com.itheima.exception;

public class Demo05 {
    public static void main(String[] args) {
        int[] arr={1,23,4};
        try {
            int i=arr[3];
            System.out.println(i);
        }catch (Exception e)
        {
            System.out.println(e.getMessage());//简短描述异常的错误原因

            System.out.println(e);

            e.printStackTrace();//详细打印异常的原因
        }
    }
}
