package com.itheima.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//1，首先通过getLogger获取Logger对象，由于该对象只会被创建一次，所以定义为静态常量。
//2，其次使用和sout方法差不多，只不过是吧输出的方向改到了文件和控制台了，其中有info()方法表示正常录入信息，error()表示错误信息
//3，xml表格中有日志文件的创建和存放地址，建议修改。
public class Demo1 {
       public static final Logger LOGGER= LoggerFactory.getLogger("com.itheima.log.Demo1");

        public static void main(String[] args) {
            test(2,0);

        }

        public static void test(int a,int b)
        {
            LOGGER.info("add方法中的参数a{},b{}",a,b);
            LOGGER.trace("add方法中的参数a{},b{}",a,b);
            LOGGER.debug("add方法中的参数a{},b{}",a,b);
            LOGGER.warn("add方法中的参数a{},b{}",a,b);
            int c=a+b;
            try{
                int i = a / b;
            }catch (Exception e)
            {
                LOGGER.error("程序报错了，除数不能为零",e);
            }

        }


}
