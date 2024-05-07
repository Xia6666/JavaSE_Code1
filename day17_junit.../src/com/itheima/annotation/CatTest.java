package com.itheima.annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class CatTest {
    @Test
    public void carTest() throws Exception {
        Class<Cat> catClass = Cat.class;
        if (catClass.isAnnotationPresent(MyPrint.class)) {
            MyPrint declaredAnnotation = catClass.getDeclaredAnnotation(MyPrint.class);
            System.out.println(declaredAnnotation.age());
            System.out.println(declaredAnnotation.name());
            System.out.println(declaredAnnotation.value());
        }

        //反射是为框架服务的，反射是用来解析注解，框架通过注解来标记，
        Method run = catClass.getDeclaredMethod("run");
        if (run.isAnnotationPresent(MyPrint.class)) {
            MyPrint declaredAnnotation = run.getDeclaredAnnotation(MyPrint.class);
            System.out.println(declaredAnnotation.age());
            System.out.println(declaredAnnotation.value());
            System.out.println(declaredAnnotation.name());

        }


    }
}
