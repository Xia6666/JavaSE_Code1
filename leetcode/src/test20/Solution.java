package test20;

import java.util.LinkedHashMap;

class Solution {
    public int firstUniqChar(String s) {
        if(s.isEmpty())
            return -1;
        LinkedHashMap<Character,Boolean> linkedHashMap=new LinkedHashMap<>();
        for (int i =0; i < s.length(); i++) {
           linkedHashMap.put(s.charAt(i),!linkedHashMap.containsKey(s.charAt(i)));
        }
        for (int i = 0; i < s.length(); i++) {
            if(linkedHashMap.get(s.charAt(i)))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().firstUniqChar("dddccdbba"));
    }
}