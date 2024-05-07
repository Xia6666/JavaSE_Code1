package test24;

import java.util.ArrayList;

class Solution {
    public int longestPalindrome(String s) {
        ArrayList<Character> arrayList=new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(arrayList.contains(s.charAt(i))) {
                int i1 = arrayList.indexOf(s.charAt(i));
                arrayList.remove(i1);

            } else
                arrayList.add(s.charAt(i));
        }
        if(arrayList.isEmpty())
        {
            return s.length();
        }
        return s.length()-arrayList.size()+1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("bb"));
    }

}