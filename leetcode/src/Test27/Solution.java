package Test27;

import java.util.Arrays;

class Solution {
    public String largestOddNumber(String num) {
        if(Integer.parseInt(String.valueOf(num.charAt(num.length()-1)))%2!=0)
            return num;
        if(num.length()==1&&Integer.parseInt(String.valueOf(num.charAt(0)))%2==0)
            return "";
        else
        {
            int light =0;
            int right=num.length()-1;
            while (light<=right)
            {
                if(Integer.parseInt(String.valueOf(num.charAt(light)))==0)
                    light++;
                if(Integer.parseInt(String.valueOf(num.charAt(right)))%2==0)
                    right--;
                else {
                    break;
                }

            }
            return num.substring(light, right+1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().largestOddNumber("486379402"));
    }
}