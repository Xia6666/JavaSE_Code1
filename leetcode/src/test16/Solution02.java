package test16;

import java.util.Arrays;

class Solution02 {
    public void reverseString(char[] s) {

        StringBuilder reverse = new StringBuilder(new String(s)).reverse();
        String s1 = reverse.toString();
        s=s1.toCharArray();
        System.out.println(Arrays.toString(s));
    }


    public static void main(String[] args) {
        new Solution02().reverseString(new char[]{'H','a','n','n','a','h'});
    }
}