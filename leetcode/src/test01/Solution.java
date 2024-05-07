package test01;

import java.util.ArrayList;

public class Solution {
    public boolean isPalindrome(int x) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        //如果x是负数，直接排除是回文数！
        if(x<0)
           return false;
        else {
            //121
            do {
                arrayList.add(x%10);
                x=x/10;
            }
            while (x!=0);

            for (int i = 0,j=arrayList.size()-1; i < arrayList.size()/2||j>arrayList.size()/2; i++,j--) {
                if(arrayList.get(i)!=arrayList.get(j))
                {

                    return false;
                }
            }
           return true;
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.isPalindrome(1234564321);
    }
}
