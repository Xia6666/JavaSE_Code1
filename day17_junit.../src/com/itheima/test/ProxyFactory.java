package com.itheima.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    public static Service getService(Service service)
    {
      return (Service)Proxy.newProxyInstance(ProxyFactory.class.getClassLoader(), new Class[]{Service.class}, new InvocationHandler() {
           @Override
           public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
               if (method.isAnnotationPresent(Log.class)) {
                   System.out.println("方法名称：" + method.getName());
                   System.out.println("参数的个数：" + method.getParameterCount());
                   Class<?>[] parameterTypes = method.getParameterTypes();
                   System.out.println("参数类型：");
                   for (Class<?> parameterType : parameterTypes) {
                       System.out.print(parameterType + " ");
                   }
                   System.out.println("返回值的类型：" + method.getReturnType());
                   Object invoke = method.invoke(service, args);
                   System.out.println("Done!");
                   return invoke;
               }
              return method.invoke(service,args);
           }
        });
    }
}
