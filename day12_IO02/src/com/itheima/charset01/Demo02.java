package com.itheima.charset01;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) throws Exception {
        //String中的编码方法 getByte()
        String s="嘿";
        byte[] bytes = s.getBytes("GBK");//不指定，默认是UTF-8不推荐。推荐手动指定规则
        System.out.println(Arrays.toString(bytes));

        //String中的解码方法 new String(byte[] bytes)
        String s1=new String(bytes, "GBK");        //默认也是通过UTF-8解码，同样也可以指定解码规则。
        System.out.println(s1);

        //注意：如果解码规则和编码规则不一致就会出现乱码的情况。
    }
}
