package com.itheima.exception;

/**
 *
 * try-catch的注意点：
 *  1. 如果没有发生异常，程序会怎么走？                -- 就不会执行catch里面的代码
 *  2. 如果发生异常，程序会怎么走？try里面以后后的代码会执行到吗？ -- 会执行catch里面的代码，try后续逻辑会跳过。
 *  3. 如果发生的异常没有被捕获到，程序会怎么走？        -- 等于try-catch白写，异常还是交给JVM处理
 *  4. 如果发生了多个异常，该怎么捕获处理？              -- 1. 叠加多个catch,如果多个catch的异常类之间有继承关系，
 *                                                             子类写上面，父类写下面
 *                                                          2. 直接catch最大个的：Exception
 *
 */
public class Demo03 {
    public static void main(String[] args) {
        try{
            int[] arr={1,2,3};
            int i=arr[3];
            System.out.println("try");
        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("catch");
        }

        System.out.println("还有一千行代码等着执行呢！");
    }
}
