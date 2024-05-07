package test19;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> characters=new ArrayList<>(10);
        Collections.addAll(characters,'a','e','i','o','u','A','E','I','O','U');
        char[] charArray = s.toCharArray();
        for(int light=0,right=charArray.length-1;light<=right;)
            if(characters.contains(charArray[light])&&characters.contains(charArray[right]))
            {
                char t=charArray[light];
               charArray[light]=charArray[right];
                charArray[right]=t;
                light++;
                right--;
            }
        else if(characters.contains(charArray[light])&&!characters.contains(charArray[right]))
            {
                right--;
            }
        else if(!characters.contains(charArray[light])&&characters.contains(charArray[right]))

            {
                light++;
            }
        else {
                light++;
                right--;
            }
        return new String(charArray);
    }

    public static void main(String[] args) {
        String s = new Solution().reverseVowels("hello");
        System.out.println(s);
    }
}