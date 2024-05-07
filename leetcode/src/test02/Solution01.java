package test02;

import java.util.HashMap;

public class Solution01 {
    public static final HashMap<Character,Integer> hashMap=new HashMap<>();

    static {
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
    }
    public int romanToInt(String s) {
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            if((i!=s.length()-1)&&(hashMap.get(s.charAt(i))>=hashMap.get(s.charAt(i+1))))
            {
                sum+=hashMap.get(s.charAt(i));
            }
            else if(i==s.length()-1)
            {
                sum+=hashMap.get(s.charAt(i));
            }
            else {
                sum-=hashMap.get(s.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Solution01().romanToInt("MCMXCIV"));
    }
}
