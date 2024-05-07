package com.itheima.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Test01 {
    //1，首先进行导入日志框架，通过LoggerFactory.getLogger方法获取Logger对象，其中有error,wain,info,debug,trace优先级依次降低！
    public static final Logger LOGGER= LoggerFactory.getLogger("com.itheima.log.Test01");
    public static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        int i=0;
        try{
            i = scanner.nextInt();
        }catch (Exception e)
        {
            LOGGER.error("输入的类型不合法！！"+e);
        }
        LOGGER.info("用户输入一个数i="+i);
    }
}
