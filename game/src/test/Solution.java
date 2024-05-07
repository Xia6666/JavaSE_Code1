package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public static void main(String[] args) {
        ArrayList<Character> list=new ArrayList<>();
        String sr="abcabcbb";
        //d,v  2   a d v  3
        //d,f 2     d f 2
        //d,v       a d v 3
        //v,d,f     v d f 3


        int[] count=new int[10000];
        int[] count1=new int[10000];
        int j=0;

        for (int i = 0; i < sr.length(); i++) {
            if(!list.contains(sr.charAt(i)))
            {
                list.add(sr.charAt(i));
                count[j]++;
            }
            else
            {
                int i1 = list.indexOf(sr.charAt(i));
                for (int k = 0; k <=i1; k++) {
                    list.remove(k);
                }
               /* list.clear();
                j++;
                list.add(sr.charAt(i));
                count1[j+1]=count[j-1]-i1+1;
                count[j]++;*/
            }
        }
        for (int i = 0; i <=j; i++) {
            count[i]=count[i]+count1[i];
        }
        Arrays.sort(count);

        System.out.println(list.size());
    }
}
