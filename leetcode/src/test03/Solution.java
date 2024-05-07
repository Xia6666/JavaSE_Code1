package test03;

import java.util.ArrayList;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null)
            return "";
        String str=strs[0];

        for (int i = 0; i < strs.length; i++) {
            if(str.length()<strs[i].length()){
                str=strs[i];
            }
        }
        for (int i = 0; i < strs.length; i++) {
            int j = 0;
            for (; j < strs[i].length(); j++) {
                if(str.charAt(j)!=strs[i].charAt(j)||j>str.length())
                {
                    break;
                }
            }
            str= str.substring(0,j);

            if(str.equals(""))
                return "";

        }
        return str;

    }

}
