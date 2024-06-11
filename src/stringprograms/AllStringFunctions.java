package stringprograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AllStringFunctions {
    public static void getCharCount(String s)
    {
        Map<Character, Integer> map = new HashMap<Character,Integer>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if (map.containsKey(key)){
                int value = map.get(key);
                map.put(key, ++value);
            }

            else
                map.put(key, 1);
        }
    map.forEach((key, value)-> System.out.println("key: "+key+" value: "+value));
    }

    public static void printUniqueChar(String s){

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if(set.contains(key))
                set.remove(key);
            else
                set.add(key);

        }
        set.forEach(s1 -> System.out.println("unique characters are: "+s1));
    }
}
