package test18;

import java.util.Arrays;

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder stringBuilder=new StringBuilder();
        while (columnNumber>0)
        {
            int n1=columnNumber%26;
            if(n1==0)
            {
                n1=26;
                columnNumber=columnNumber-26;
            }
            columnNumber=columnNumber/26;
            stringBuilder.append(n1);
            stringBuilder.append(",");
        }
        String s = stringBuilder.toString();
        System.out.println(s);
        String substring = s.substring(0, s.length() - 1);
        System.out.println(substring);
        String[] strings = substring.split(",");
        System.out.println(Arrays.toString(strings));
        StringBuilder stringBuilder1=new StringBuilder();
        for (int index = strings.length - 1; index >= 0; index--) {
            stringBuilder1.append((char) (Integer.parseInt(strings[index]) + 64));
        }
        return stringBuilder1.toString();
    }
}