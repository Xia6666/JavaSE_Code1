package test22;

import java.util.Arrays;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        return Arrays.equals( extracted(s),extracted(t));
    }

    private static boolean[] extracted(String t) {
        boolean[] booleans1=new boolean[t.length()];
        for (int i = 0; i < t.length(); i++) {
            for (int j = 0; j < t.length() ; j++) {
                if(t.charAt(i)== t.charAt(j)&&i!=j)
                {
                    booleans1[i]=true;
                    break;
                }
            }
        }
        return booleans1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isIsomorphic("paper", "title"));
    }
}