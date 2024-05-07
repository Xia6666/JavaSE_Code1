package test23;

import java.util.Arrays;
/*
* g = [1,2,3],
*
* s = [1,1]
*
* */
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0,j=0;
        for (; i < g.length && j < s.length; ) {
            if(g[i]<=s[j])
            {
                i++;j++;
            }
            else {
                j++;
            }
        }
        return i;

    }

    public static void main(String[] args) {
        System.out.println(new Solution().findContentChildren(new int[]{1,2}, new int[]{}));
    }
}