package test04;

import java.util.HashMap;
import java.util.LinkedList;

public class Solution01 {
    //  ( ( [ ] ) { } )
    //
    //
    //
    //
    public boolean isValid(String s) {
        if(s.isEmpty())
            return false;
        HashMap<Character,Character> hashMap=new HashMap<>();
        hashMap.put('(',')');
        hashMap.put('{','}');
        hashMap.put('[',']');
        hashMap.put('K','V');
        LinkedList<Character> characters=new LinkedList<>();
        characters.addLast('K');
        for (int i = 0; i < s.length(); i++) {
            if(hashMap.containsKey(s.charAt(i)))
            {
                characters.addLast(s.charAt(i));
            }
            else if(hashMap.get(characters.getLast()).equals(s.charAt(i)))
            {
                characters.removeLast();
            }
            else
                return false;

        }
        return characters.getLast().equals('K');
    }

}
