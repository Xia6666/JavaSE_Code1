package test05;

import java.util.Arrays;

public class Solution01 {
    public int removeDuplicates(int[] nums) {
        int p=0;
        int q=1;
        while (q<nums.length)
        {
            if(nums[p]!=nums[q])
            {
                nums[p+1]=nums[q];
                p++;
            }
            q++;
        }
        System.out.println(Arrays.toString(nums));
        return p+1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution01().removeDuplicates(new int[]{1,1,2, 2, 2, 3, 4, 5}));
    }
}
