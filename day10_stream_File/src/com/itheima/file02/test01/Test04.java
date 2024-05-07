package com.itheima.file02.test01;

import java.io.File;
import java.util.HashMap;
public class Test04 {
    public static void main(String[] args) {
        //统计各种文件类型的数量
        HashMap<String,Integer> hashMap=new HashMap<>();
        File file=new File("/Users/xiaquanen/IdeaProjects/JavaSE_Code_64/JavaSE_Code_64/day09_map/src/com/itheima/map01");
        count(file,hashMap);
        System.out.println(hashMap);
    }

    public static void count(File file,HashMap<String,Integer> hashMap)
    {
        if (file.isFile()) {
                if((file.getName()).contains("."))
                {
                    String[] split = file.getName().split("\\.");
                    if(hashMap.containsKey(split[split.length-1]))
                    {
                        Integer i1 = hashMap.get(split[split.length-1]);
                        hashMap.put(split[split.length-1],++i1);
                    }
                    else
                        hashMap.put(split[split.length-1],1);
                }
            }
        else {
            File[] files = file.listFiles();
            if (files != null) {
                for (File file1 : files) {
                    count(file1,hashMap);
                }
            }
        }
    }
}
