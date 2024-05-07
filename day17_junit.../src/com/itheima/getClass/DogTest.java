package com.itheima.getClass;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
*
* 反射的使用场景，都是在框架中使用，注解本身是没有任何逻辑的，相当于给框架扫描的时候做标记用的
* 反射的执行效率极低，一般情况下不用
*
* */

public class DogTest {
    @Test
    public void test() throws Exception {
        //通过类名.class可以获得该类的类对象
        Class<Dog> dogClass = Dog.class;
                      //获取全限定名
        String name = dogClass.getName();

        //通过Class.forName(全限定类名(包名加类名))获取该类的对象
        Class<?> aClass = Class.forName(name);
                          //获取类名
        String simpleName = aClass.getSimpleName();
        System.out.println(simpleName);

        //通过该类的对象调用getClass()方法获取该类对象
        Dog dog = new Dog();
        Class<? extends Dog> aClass1 = dog.getClass();
        System.out.println(aClass1.getSimpleName());


        //可以通过类对象获取其构造器
        Constructor<?>[] constructors1 = dogClass.getConstructors();//获取全部非私有的构造器，并且返回一个构造器数组
        Constructor<?>[] constructors2 = dogClass.getDeclaredConstructors();//获取全部的构造器，并且返回一个构造器数组
        Constructor<Dog> constructors3 = dogClass.getConstructor();//指定参数的获取构造器，默认获取无参构造
        Constructor<Dog> constructor4 = dogClass.getConstructor(String.class, String.class, Integer.class);//指定参数获取构造函数
        Constructor<Dog> constructor5 = dogClass.getDeclaredConstructor();//无视修饰符号获取
        Constructor<Dog> constructor6 = dogClass.getDeclaredConstructor(String.class, String.class, Integer.class);//无视修饰符号获取有参构造

        for (Constructor<?> constructor : constructors2) {
            System.out.println(constructor.getName());//获取构造器的名称，就是类的全限定名
            System.out.println(constructor.getParameterCount());//获取构造器形参的个数
        }

        Dog dog1 = constructor6.newInstance("Tom", "公", 10);//通过newInstance方法创建对象
        System.out.println(dog1);

        ArrayList<String> arrayList=new ArrayList<>();
        Field[] declaredFields = dogClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
           arrayList.add(declaredField.getName());
        }
        Field declaredField = dogClass.getDeclaredField(arrayList.get(0));
        declaredField.setAccessible(true);
        declaredField.set(dog1,"jerry1");

        Field declaredField1= dogClass.getDeclaredField(arrayList.get(1));
        declaredField1.setAccessible(true);
        declaredField1.set(dog1,"母");

        Field declaredField2 = dogClass.getDeclaredField(arrayList.get(2));
        declaredField2.setAccessible(true);
        declaredField2.set(dog1,6);

        //通过该类的对象获取其属性值
        Field name1 = dogClass.getDeclaredField("name");
        name1.setAccessible(true);
        name1.set(dog1,"jerry");
        System.out.println(dog1);

        Method[] declaredMethods = dogClass.getDeclaredMethods();//获取所有方法
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName()+"--->"+declaredMethod.getParameterCount());
        }
        //通过getDeclaredMethod()方法获取方法，需要传入方法名以及方法参数类型
        Method eat = dogClass.getDeclaredMethod("eat", String.class);
        //通过setAccessible()方法破解权限
        eat.setAccessible(true);
        //通过invoke方法去调用方法
        eat.invoke(dog1,"狗屎");





    }

}
