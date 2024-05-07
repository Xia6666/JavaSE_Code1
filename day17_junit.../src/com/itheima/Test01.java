package com.itheima;

import com.itheima.annotation.MyPrint;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test01 {
    @Test
    public void getTest() throws Exception {
        //获取MyTest类对象
        Class<MyTest> myTestClass = MyTest.class;
        //通过获取的类对象创建一个对象
        Constructor<MyTest> declaredConstructor = myTestClass.getDeclaredConstructor();
        MyTest myTest = declaredConstructor.newInstance();
        //再获取所有的方法
        Method[] declaredMethods = myTestClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            if(declaredMethod.isAnnotationPresent(MyPrint.class))
            {
                declaredMethod.invoke(myTest);
            }
        }
    }



    private static class MyTest{
        @MyPrint(name = "小猫",value ="12",age =13)
        private void run()
        {
            System.out.println("小猫在跑");
        }
        public void eat()
        {
            System.out.println("小猫在吃");
        }
        @MyPrint(name = "小猫",value ="12",age =13)
        public void drink()
        {
            System.out.println("小猫在喝");
        }

        public void sleep()
        {
            System.out.println("小猫在睡");
        }


    }
}
