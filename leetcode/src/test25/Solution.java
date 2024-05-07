package test25;

import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int light=0;
        int right=1;
        int min=0;
        while (right<nums.length) {
            min+= Math.min(nums[light], nums[right]);
            light+=2;
            right+=2;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().arrayPairSum(new int[]{6,2,6,5,1,2}));
    }
}