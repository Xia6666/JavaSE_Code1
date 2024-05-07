package com.itheima.test;

import java.lang.reflect.Method;

public class ServiceImpl implements Service {
    @Log
    @Override
    public void execute() {
        System.out.println("Executing service method");
    }

/*
    public static void main(String[] args) throws Exception {
        ServiceImpl service=new ServiceImpl();
        Class<? extends ServiceImpl> aClass = service.getClass();
        Method execute = aClass.getDeclaredMethod("execute");
        if (execute.isAnnotationPresent(Log.class)) {
            execute.invoke(service);
        }else
            System.out.println("sdsa");

    }*/
}