package test02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Demo {
    public static void main(String[] args) throws Exception {
        HashMap<String,Integer> hashMap=new HashMap<>();
        ArrayList<Integer> arrayList=new ArrayList<>();
        ArrayList<Integer> arrayList1=new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("test/src/test02/work.txt")));
        String s;
        //将单词以及出现的次数哦添加的hashMap集合中
        while ((s=br.readLine())!=null)
        {
            String[] split = s.split(",");
            for (String string : split) {
                hashMap.put(string,(hashMap.getOrDefault(string,0))+1);
            }
        }
        br.close();

        Set<String> set = hashMap.keySet();
        for (String string : set) {
           arrayList.add(hashMap.get(string));
        }
        Collections.sort(arrayList);
        //将出现出现次数最多的6个的值存入集合
        for (int i = arrayList.size() - 1; i >=arrayList.size() - 6; i--) {
            arrayList1.add(arrayList.get(i));
        }
        int j=0;
        for (Integer i : arrayList1) {
            int n=i;
            for (String ignored : set) {
                if(hashMap.get(ignored)==n)
                {
                    if(j>=6) break;
                    System.out.println(ignored);
                    j++;
                }
            }
        }
    }
}
