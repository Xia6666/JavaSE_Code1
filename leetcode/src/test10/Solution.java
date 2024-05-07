package test10;

import java.util.TreeSet;

class Solution {
    public int searchInsert(int[] nums, int target) {
        TreeSet<Integer> treeSet=new TreeSet<>();
        for (int num : nums) {
            treeSet.add(num);
        }
        treeSet.add(target);
        int k=0;
        for (Integer i : treeSet) {
            if(i==target)
            {
               break;
            }
            k++;
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().searchInsert(new int[]{1,3,5,6}, 7));
    }
}