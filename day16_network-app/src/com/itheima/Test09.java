package com.itheima;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        App app = new App();
        new Thread(() -> {
            try {
                app.sev();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).start();
            new Thread(() -> {
                try {
                    app.send();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }).start();
    }

    private static class App {
        public void send() throws Exception {
            Socket socket = new Socket("127.0.0.1", 2121);
            OutputStream outputStream = socket.getOutputStream();
            InputStream inputStream = socket.getInputStream();
            byte[] bytes = new byte[1024 * 8];
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("请输入要发送的信息：");
                String msg = scanner.next();
                if (Objects.equals(msg, "bye")) {
                    socket.close();
                    break;
                }
                outputStream.write(msg.getBytes(StandardCharsets.UTF_8));
                outputStream.flush();
                int read = inputStream.read(bytes);
                System.out.print("客户端收到信息：");
                System.out.println(new String(bytes, 0, read));
            }

        }

        public void sev() throws Exception {

            ServerSocket serverSocket = new ServerSocket(2121);
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            byte[] bytes = new byte[1024 * 8];
            while (true) {
                int read;
                String s;
                try {
                    read = inputStream.read(bytes);
                  s = new String(bytes, 0, read);
                }catch (Exception e)
                {
                    System.out.println("监测到客户端退出了，我也退出了！！！");
                    serverSocket.close();
                    return;
                }
                System.out.print("服务器端收到信息：");
                System.out.println(s);
                outputStream.write(bytes, 0, read);
                outputStream.flush();
            }
        }
    }}