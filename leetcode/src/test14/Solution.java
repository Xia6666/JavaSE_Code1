package test14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        Arrays.sort(nums);
        for (int num : nums) {
            if (hashMap.containsKey(num)) {
                Integer i1 = hashMap.get(num);
                i1++;
                hashMap.put(num, i1);
            } else
                hashMap.put(num, 1);
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : hashMap.entrySet()) {
            if (integerIntegerEntry.getValue()>nums.length/2)
                return integerIntegerEntry.getKey();
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().majorityElement(new int[]{-1,1,1,1,2,1}));
    }
}