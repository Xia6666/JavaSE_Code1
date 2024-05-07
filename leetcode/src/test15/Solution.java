package test15;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> hashMap=new HashMap<>();
        hashMap.put('2',"abc");
        hashMap.put('3',"def");
        hashMap.put('4',"ghi");
        hashMap.put('5',"jkl");
        hashMap.put('6',"mno");
        hashMap.put('7',"pqrs");
        hashMap.put('8',"tuv");
        hashMap.put('9',"wxyz");
        ArrayList<String> strings=new ArrayList<>(4);

        for (int i = 0; i < digits.length(); i++) {
           strings.add(hashMap.get(digits.charAt(i)));
        }
       return new ArrayList<>();


    }

    private static String extracted(ArrayList<String> strings,String str) {
        if(strings.isEmpty())
        {
            return str;
        }
        for (int i = 0; i < strings.size(); i++) {
            for (int i1 = 0; i1 < strings.get(i).length(); i1++) {
                str = String.valueOf(str.charAt(i1) + strings.get(i).charAt(i1));

            }
            strings.remove(i);
            extracted(strings,str);
        }
        return "";
    }

}