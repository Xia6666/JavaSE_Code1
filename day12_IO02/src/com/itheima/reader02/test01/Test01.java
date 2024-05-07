package com.itheima.reader02.test01;

import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test01 {
    public static void main(String[] args) throws Exception{
        FileReader fr=new FileReader("day12_IO02/resource/b.txt");
      //  HashMap<String,String> hashMap=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
       /* char[] chars=new char[1024];
        int len = fr.read(chars);
        String s=new String(chars,0,len);*/
        //通过循环读取，避免了数组浪费空间，采取StringBuilder动态拼接字符串，也同样节省了内存开销
        int ch;
        StringBuilder stringBuilder=new StringBuilder();
        while ((ch= fr.read())!=-1)
        {
            stringBuilder.append(ch);
        }
        fr.close();
        String s = stringBuilder.toString();
        String[] split = s.split(System.lineSeparator());

        //通过stream流直接获取集合
        Map<String, String> hashMap = Arrays.stream(split).collect(Collectors.toMap(str -> str.split("=")[0], str -> str.split("=")[1]));

      /*  for (String string : split) {
            String[] split1 = string.split("=");
            hashMap.put(split1[0],split1[1]);
        }*/
        System.out.println("请输入用户名：");
        String name=scanner.next();
        if(hashMap.containsKey(name))
        {
            System.out.println("请输入密码：");
            String pws=scanner.next();
            if(hashMap.get(name).equals(pws))
            {
                System.out.println("登陆成功！欢迎你"+name);
            }
            else
                System.out.println("登陆失败，密码错误！");
        }
        else
            System.out.println("用户不存在！");
    }
}
