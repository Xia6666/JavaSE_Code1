package com.itheima.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)     //元注解，用于修饰注解的注解,当注解中只有value值的时候，键的名称不用书写了。该注解是用来标注在什么时候销毁
@Target({ElementType.METHOD,ElementType.TYPE})//该注解是用来标注在哪些地方可以使用
public @interface MyPrint {
    String name() default "";
    String value();
    int age() default 0;
}
