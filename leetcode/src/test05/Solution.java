package test05;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if(!arrayList.contains(nums[i]))
            {
                arrayList.add(nums[i]);
            }
        }
        int [] nums1=new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            nums1[i]=arrayList.get(i);
        }
        nums=nums1;
        System.out.println(Arrays.toString(nums));
        return nums.length;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
