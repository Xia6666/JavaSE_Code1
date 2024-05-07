package com.itheima;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TPCDemo02 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor=new ThreadPoolExecutor(2,3,30, TimeUnit.SECONDS,new ArrayBlockingQueue<>(1),new ThreadPoolExecutor.AbortPolicy());
        TPCDemo02 tpcDemo01 = new TPCDemo02();
        executor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    tpcDemo01.send();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

     /*   executor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    tpcDemo01.re();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });*/

    }


    public void send() throws Exception {
        //首先创建一个Socket对象，里面存放需要发送的服务器的地址和和端口
        Socket socket = new Socket("192.168.12.64", 6666);
        //再通过Socket对象获取字节流进行文件的传输和读写
        OutputStream outputStream1 = socket.getOutputStream();


   /*     FileInputStream fileInputStream1 = new FileInputStream("/Users/xiaquanen/Desktop/aaa.jpeg");
        BufferedInputStream fileInputStream=new BufferedInputStream(fileInputStream1);
        byte[] bytes=new byte[1024*8];
        int read = fileInputStream.read(bytes);*/
        byte[] bytes = "菜就多练".getBytes();
        System.out.println(Arrays.toString(bytes));



        outputStream1.write(bytes);
        socket.close();

        }

    }

  /*  public synchronized void  re() throws Exception{
        //服务器端通过创建ServerSocket对象里面放入所要接收的客户端端口，
        ServerSocket serverSocket=new ServerSocket(8888);
        //通过调用accept方法获取一个Socket对象
        Socket socket = serverSocket.accept();
        //之后的动作就和客户端一样了，就相当于通过socket这个管道将两端连起来了
        InputStream inputStream1=socket.getInputStream();
        DataInputStream inputStream=new DataInputStream(inputStream1);
        while (true)
        {

                try {
                    String s = inputStream.readUTF();
                    System.out.println("成功接收到消息："+s);
                } catch (Exception e) {
                    System.out.println("监测到客户端关闭，服务器端也跟着关闭！");
                    serverSocket.close();
                    return;
                }
            }
        }*/


