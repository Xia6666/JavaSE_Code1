package test07;

class Solution {
    public int strStr(String haystack, String needle) {
            if(haystack.equals(needle))
                return 0;
            if(haystack.contains(needle))
            {
                String[] split = haystack.split(needle);
                if(split.length==0)
                    return 0;
                if(split[0].isEmpty())
                return 0;
                else return split[0].length();
            }
            else return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().strStr("aaa","a"));
    }
}