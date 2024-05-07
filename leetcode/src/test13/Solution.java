package test13;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String addBinary(String a, String b) {

        if(a.length()>=b.length())
        {
            int k=0;
            for (int length = b.length()-1,i=a.length()-1; length >=0; length--,i--) {
                if((byte)(a.charAt(i))+(byte)(b.charAt(length))!=2)
                {

                }

            }



        }










        ArrayList<Character> arrayList=new ArrayList<>();
        ArrayList<Character> arrayList1=new ArrayList<>();
        char[] charArray = a.toCharArray();
        char[] charArray1 = b.toCharArray();
        for (char c : charArray) {
            arrayList.add(c);
        }
        for (char c : charArray1) {
            arrayList1.add(c);
        }
        if(arrayList1.size()<=arrayList.size())
        {
        }



        return arrayList.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }
}