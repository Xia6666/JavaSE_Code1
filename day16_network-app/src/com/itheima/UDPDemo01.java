package com.itheima;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.*;
import java.util.concurrent.*;

public class UDPDemo01 {
    public static void main(String[] args) throws Exception{
        ThreadPoolExecutor executor=new ThreadPoolExecutor(2,3,30, TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(10),new ThreadPoolExecutor.AbortPolicy());
        Future<byte[]> future = executor.submit(new Callable<byte[]>() {
            @Override
            public byte[] call() throws Exception {
                return new UDPDemo01().re();
            }
        });
        executor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    new UDPDemo01().sent();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

            FileOutputStream fileOutputStream=new FileOutputStream("/Users/xiaquanen/IdeaProjects/JavaSE_Code_64/JavaSE_Code_64/aaa.jpeg");
            fileOutputStream.write(future.get());
            fileOutputStream.close();

    }
    public void sent() throws IOException {
        //首先通过DatagramSocket类创建出一个对象，形参列表中填写端口名称，接收端需要填写端口后，
        DatagramSocket datagramSocket=new DatagramSocket(6666);

        //
        FileInputStream fileInputStream=new FileInputStream("/Users/xiaquanen/Desktop/aaa.jpeg");

        byte[] bytes=new byte[1024*8];
        int read = fileInputStream.read(bytes);

        InetAddress inetAddress=InetAddress.getLocalHost();

        DatagramPacket datagramPacket=new DatagramPacket(bytes,read,inetAddress,8888);

        datagramSocket.send(datagramPacket);
        datagramSocket.close();
        fileInputStream.close();


    }

    public byte[] re() throws Exception {
        DatagramSocket datagramSocket=new DatagramSocket(8888);

            byte[] bytes=new byte[1024*8];
            DatagramPacket datagramPacket=new DatagramPacket(bytes,bytes.length);
            datagramSocket.receive(datagramPacket);

        int length = datagramPacket.getLength();
        byte[] data = datagramPacket.getData();
        byte[] data1=new byte[length];
        System.arraycopy(data,0,data1,0,length);
        return data1;


   /*     FileOutputStream outputStream=new FileOutputStream("/Users/xiaquanen/IdeaProjects/JavaSE_Code_64/JavaSE_Code_64/aaa.jpeg");
        outputStream.write(data,0,length);
        outputStream.close();*/


    }

}
