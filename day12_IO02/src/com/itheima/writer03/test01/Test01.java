package com.itheima.writer03.test01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test01 {
    public static void main(String[] args) throws Exception{
        Scanner scanner=new Scanner(System.in);
        FileReader fr=new FileReader("day12_IO02/resource/b.txt");
        int read;
        StringBuilder stringBuilder=new StringBuilder();
        while ((read=fr.read())!=-1)
        {
            stringBuilder.append((char) read);//注意：提出来的是字符不是字面值，需要char转型
        }
        fr.close();
        String[] split = stringBuilder.toString().split(System.lineSeparator());
        Map<String, String> stringMap = Arrays.stream(split).collect(Collectors.toMap(string -> string.split("=")[0], string -> string.split("=")[1]));
        System.out.println("请输入你要注册的用户名：");
        String name= scanner.next();
        String pws;
        if(stringMap.containsKey(name))
            System.out.println("该用户已经存在");
        else
        {
            System.out.println("请输入密码");
           pws=scanner.next();
           stringMap.put(name,pws);
            System.out.println("恭喜你添加成功！");
        }
        write(stringMap);
    }

    private static void write(Map<String, String> stringMap) throws IOException {
        FileWriter fw=new FileWriter("day12_IO02/resource/b.txt");
        StringBuilder stringBuilder=new StringBuilder();
        stringMap.forEach((k, v)-> stringBuilder.append(k).append("=").append(v).append(System.lineSeparator()));
        fw.write(stringBuilder.toString());
        fw.close();
    }
}
