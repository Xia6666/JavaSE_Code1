package com.itheima.list03.test06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/*
2016年里约热内卢奥运会足球比赛，共有16只球队参赛，分别是
巴西、阿根廷、丹麦、德国、葡萄牙、瑞典、斐济、洪都拉斯、墨西哥、阿尔及利亚、尼日利亚、
南非、伊拉克、日本、韩国、哥伦比亚。请使用所学集合知识，编写程序把这16支球队随机分成四组，输出结果如下：
    第1组：
    哥伦比亚 韩国 伊拉克 葡萄牙
    第2组：
    阿尔及利亚 南非 斐济 尼日利亚
    第3组：
    阿根廷 墨西哥 日本 洪都拉斯
    第4组：
    瑞典 丹麦 德国 巴西
 */

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        Collections.addAll(arrayList,"巴西","阿根廷","丹麦","德国",
                "葡萄牙","瑞典","斐济","洪都拉斯",
                "墨西哥","阿尔及利亚","尼日利亚",
                "南非","伊拉克","日本","韩国","哥伦比亚");

        System.out.println("第一组："+ Arrays.toString(get(arrayList)));
        System.out.println("第二组："+ Arrays.toString(get(arrayList)));
        System.out.println("第三组："+ Arrays.toString(get(arrayList)));
        System.out.println("第四组："+ Arrays.toString(arrayList.toArray()));
    }
    public static String[] get(ArrayList<String> arrayList)
    {
        Random random=new Random();
        int j=arrayList.size()-1;
        String[] s=new String[4];
        for (int i = 0; i < s.length; i++,j--) {
            int i1 = random.nextInt(j);
            String remove = arrayList.remove(i1);
            s[i]=remove;
        }
        return s;
    }

}

