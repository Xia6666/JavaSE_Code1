package test09;

import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        int[] arr=new int[digits.length];
        if (digits[digits.length-1]!=9)
        {
            System.arraycopy(digits,0,arr,0,digits.length-1);
            arr[arr.length-1]=digits[digits.length-1]+1;
            return arr;
        }
        int j=1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if(digits[i]+j>=10)
            {
                arr[i]=digits[i]%10;
                j=1;
            }
            else
            {
                j=0;
                arr[i]=digits[i]+j;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] ints = new Solution().plusOne(new int[]{9});
        System.out.println(Arrays.toString(ints));
    }

}
//