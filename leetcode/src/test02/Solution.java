package test02;

import java.util.HashMap;

public class Solution {
    public static final HashMap<String,Integer> hashMap=new HashMap<>();

    static {
        hashMap.put("I",1);
        hashMap.put("V",5);
        hashMap.put("X",10);
        hashMap.put("L",50);
        hashMap.put("C",100);
        hashMap.put("D",500);
        hashMap.put("M",1000);

        hashMap.put("IV",4);
        hashMap.put("IX",9);
        hashMap.put("XL",40);
        hashMap.put("XC",90);
        hashMap.put("CD",400);
        hashMap.put("CM",900);

    }
    public int romanToInt(String s) {

        int sum=0;

                for (int i = 0; i < s.length();) {
                   if(
                   ((i!=s.length()-1)&&(s.charAt(i)+""+s.charAt(i+1)).equals("IV")))
                   {
                       sum+=4;
                        i+=2;
                   } else if ((i != s.length() - 1) && (s.charAt(i) + "" + s.charAt(i + 1)).equals("IX")){
                        sum+=9;
                        i+=2;
                    }else if ((i != s.length() - 1) && (s.charAt(i) + "" + s.charAt(i + 1)).equals("XL")){
                        sum+=40;
                        i+=2;
                    }else if ((i != s.length() - 1) && (s.charAt(i) + "" + s.charAt(i + 1)).equals("XC")){
                        sum+=90;
                        i+=2;
                    }else if ((i != s.length() - 1) && (s.charAt(i) + "" + s.charAt(i + 1)).equals("CD")){
                        sum+=400;
                        i+=2;
                    }else if ((i != s.length() - 1) && (s.charAt(i) + "" + s.charAt(i + 1)).equals("CM")){
                        sum+=900;
                        i+=2;
                    }

                   else {
                       sum+=hashMap.get((s.charAt(i))+"");
                       i++;
                   }
                }
                return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("MCMXCIV"));
    }
}
