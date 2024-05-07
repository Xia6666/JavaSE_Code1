package com.itheima;

import java.net.InetAddress;
import java.util.Arrays;

/*
* InetAddress在工作中主要用于IP地址的解析和表示，但是后续用框架的使用，很少再用这个。
* */
public class InetAddressDemo01 {
    public static void main(String[] args) throws Exception{
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println("本机的ip地址："+localHost);

        InetAddress byName = InetAddress.getByName("www.baidu.com");
        System.out.println("百度的IP信息是："+byName);

        String hostName = localHost.getHostName();
        System.out.println("我的本机的主机名："+hostName);

        String address = localHost.getHostAddress();
        System.out.println("我本机的ip："+address);


    }
}
