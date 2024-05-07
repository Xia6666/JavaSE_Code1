package com.itheima.exception;

public class Demo06 {
    public static void main(String[] args) {

        method(17);
    }
    public static void method(int age)
    {
        if(age<18)
            throw new AgeRuntimeException("年龄不满18岁");//  throw是在方法中抛出异常对象，而throws是在方法申明处抛出
                                        //   throw是将异常对象抛给了方法调用者
        else
            System.out.println("欢迎");

    }

}
