package test08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

class Solution {
    public int lengthOfLastWord(String s) {
        String[] split = s.split(" ");
        ArrayList<String> arrayList=new ArrayList<>();
        for (String string : split) {
            if(!string.isEmpty())
            {
                arrayList.add(string);
            }
        }

        return arrayList.get(arrayList.size()-1).length();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLastWord("luffy is still joyboy"));
    }
}