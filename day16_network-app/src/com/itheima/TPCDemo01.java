package com.itheima;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TPCDemo01 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor=new ThreadPoolExecutor(2,3,30, TimeUnit.SECONDS,new ArrayBlockingQueue<>(1),new ThreadPoolExecutor.AbortPolicy());
        TPCDemo01 tpcDemo01 = new TPCDemo01();
        executor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    tpcDemo01.send();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        executor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    tpcDemo01.re();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

    }


    public void send() throws IOException {
        //首先创建一个Socket对象，里面存放需要发送的服务器的地址和和端口
        Socket socket = new Socket("192.168.12.74", 8888);
        //再通过Socket对象获取字节流进行文件的传输和读写
        OutputStream outputStream1 = socket.getOutputStream();
        DataOutputStream outputStream=new DataOutputStream(outputStream1);
        Scanner scanner=new Scanner(System.in);
        while (true)
        {
            System.out.println("请输入：");
            String msg=scanner.next();
            if(Objects.equals("exit",msg))
            {
                System.out.println("客户端关闭，欢迎下次使用！");
                socket.close();
                return;
            }
            outputStream.writeUTF(msg);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public synchronized void  re() throws Exception{
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
        }



    }
