package test11;

import java.util.HashSet;

class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty())
            return false;

        StringBuilder stringBuilder=new StringBuilder();
        String[] split = s.split(" ");

        for (String string : split) {
            for (int j = 0; j < string.length(); j++) {
                char c = string.charAt(j);
                if ((c >= 'A' && c <='Z') || (c >= 'a' && c <= 'z')||(c>=48&&c<=57)) {
                    stringBuilder.append(c);
                }
            }
        }
        String s1 = stringBuilder.toString();
        if(s1.isEmpty())
            return true;
        String lowerCase = s1.toLowerCase();
        System.out.println(lowerCase);
        for (int i = 0,j=lowerCase.length()-1; i<=lowerCase.length()/2; i++,j--) {
            if(lowerCase.charAt(i)!=lowerCase.charAt(j))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome("Zeus was deified, saw Suez."));;
    }
}