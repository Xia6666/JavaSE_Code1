package test04;

import java.util.HashMap;

public class Solution {
       private static HashMap<Character,Character> hashMap=new HashMap<>();
        static {
            hashMap.put('(',')');
            hashMap.put('{','}');
            hashMap.put('[',']');
    }
    public boolean isValid(String s) {
        if (s.isEmpty())
            return false;
        if(s.length()%2!=0)
            return false;

        return isValid2(s)||isValid1(s);
    }

    public boolean isValid1(String s)
    {
        int j= s.length()-1;
        for (int i = 0; i < s.length()/2; i++) {
            char firstS=s.charAt(i);
            if (!hashMap.containsKey(firstS))
                return false;
            for ( ; j >=s.length()/2; ) {
                char lastS=s.charAt(j);
                if(hashMap.get(firstS).equals(lastS))
                {
                    j=j-1;
                   break;
                }
                return false;
            }
        }
        return true;
    }
    public boolean isValid2(String s)
    {
               for (int j = 0; j < s.length(); j += 2) {
            char firstS = s.charAt(j);
                   if (!hashMap.containsKey(firstS))
                       return false;
            for (int i = j+1; i < s.length(); i += 2) {
                if (hashMap.get(firstS).equals(s.charAt(i)))
                    break;
                else
                    return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isValid("(([]){})"));
    }



    }



