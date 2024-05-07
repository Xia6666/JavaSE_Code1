package com.itheima.fileInputStream02.test02;

import java.io.FileInputStream;
import java.util.HashMap;

public class Test02 {
    public static void main(String[] args) throws Exception {
        FileInputStream in=new FileInputStream("day11_IO01/xia.txt");
        HashMap<String,Integer> hashMap=new HashMap<>();
        byte[] bytes=new byte[1024];
        int len = in.read(bytes);
        String[] split1 = new String(bytes,0,len).split(System.lineSeparator());
        for (String string1 : split1) {
            String[] split = string1.split(",");
            for (String string : split) {
                if(hashMap.containsKey(string))
                {
                    int count = hashMap.get(string);
                    count++;
                    hashMap.put(string,count);
                }
                if(!(hashMap.containsKey(string))&&string!=null) {
                    hashMap.put(string,1);
                }
            }
        }
        in.close();
        hashMap.forEach((k,v)-> System.out.print(k+"==>"+v+"  "));

    }
}
