package test16;

import java.util.Arrays;

class Solution {
    public void reverseString(char[] s) {


        for (int start=0,end=s.length-1; start<=end; start++,end--) {
            char a=s[start];
            s[start]=s[end];
            s[end]=a;
        }

        System.out.println(Arrays.toString(s));
    }


    public static void main(String[] args) {
        new Solution().reverseString(new char[]{'H','a','n','n','a','h'});
    }
}