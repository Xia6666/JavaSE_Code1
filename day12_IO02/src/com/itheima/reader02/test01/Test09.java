package com.itheima.reader02.test01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Test09 {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader=new BufferedReader(new FileReader("day12_IO02/resource/maths.txt"));

        ArrayList<String> arrayList=new ArrayList<>();
        String str;
        while ((str=bufferedReader.readLine())!=null)
        {
            if(str.contains("+"))
            {
                String[] split = str.split("\\+");
                arrayList.add(split[0]+"+"+split[1]+"="+(new BigDecimal(split[0]).add(new BigDecimal(split[1]))));
            } if(str.contains("-"))
            {
                String[] split = str.split("-");
                arrayList.add(split[0]+"-"+split[1]+"="+(new BigDecimal(split[0]).subtract(new BigDecimal(split[1]))));
            } if(str.contains("*"))
            {
                String[] split = str.split("\\*");
                arrayList.add(split[0]+"*"+split[1]+"="+(new BigDecimal(split[0]).multiply(new BigDecimal(split[1]))));
            } if(str.contains("/")) {
            String[] split = str.split("/");
            arrayList.add(split[0] + "/" + split[1] + "=" + (new BigDecimal(split[0]).divide(new BigDecimal(split[1]), 2)));
             }
        }
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("day12_IO02/resource/maths.txt"));
        for (String string : arrayList) {
            bufferedWriter.write(string);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
