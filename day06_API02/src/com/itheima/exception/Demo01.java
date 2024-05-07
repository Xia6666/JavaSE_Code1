package com.itheima.exception;

public class Demo01 {
    public static void main(String[] args) throws Exception{
        /*
            第一步：拿null来访问索引，jvm底层会产生一个异常对象：throw new NullPointerException();
            第二步：jvm检测当前语法，是否有对该异常对象的处理逻辑
                    a.用户有定义处理异常的逻辑：
                    b.用户没有处理异常的逻辑：那么这个异常对象会上交给当前方法的调用者处理!!!

            第三步：如果最终异常提交到jvm手中进行处理，jvm会做两件事情：
                    1. 先通报批评：将异常对象信息打印到控制台
                    2. 罢工，不干了：中断后续程序的处理。
         */
       // try {
    int [] arr=null;
    int i = arr[0];
    System.out.println(i);
//}catch (Exception exception)
//{
//    System.out.println(exception);
//}
        System.out.println("还有一万行代码呢！");

    }

}
