package com.itheima.exception;

public class Demo07 {
    public static void main(String[] args) {
        int[] arr ={11,2,3,4};

        try{
            int n=arr[4];
            System.out.println(n);
        }catch (Exception e)
        {
            System.out.println("捕捉到异常了！");
        }
        finally {
            System.out.println("不管捕捉不捕捉我都执行！，但是我之后的程序可就不一定了，具体看发生异常后有没有捕捉处理！");
        }

        System.out.println("到我这了！");

    }
}
