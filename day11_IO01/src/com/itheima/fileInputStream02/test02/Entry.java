package com.itheima.fileInputStream02.test02;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class Entry {

    public static void main(String[] args) throws Exception {
        String s="王亚楠我爱你";

        // 调用getCodeInputStream方法，传递用户姓名，请求二维码生成程序，得到字节输入流对象
        InputStream inputStream = getCodeInputStream(s);
        FileOutputStream op=new FileOutputStream("day11_IO01/code.png");
        int len;
        byte[] bytes=new byte[1024];
        while ((len=inputStream.read(bytes))!=-1)
        {
            op.write(bytes,0,len);
        }

        inputStream.close();
        op.close();

    }

    // 请求生成二维码程序
    public static InputStream getCodeInputStream(String name) {
        try {
            String encode = URLEncoder.encode(name, "UTF-8");
            URL url = new URL("http://localhost/qrcode/userInfo/" + encode);
            URLConnection connection = url.openConnection();
            InputStream inputStream = connection.getInputStream();
            return inputStream ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null ;
    }

}
