package stringprograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {



    public static void main(String[] args) {
        String str = "aabccd";
//        countDuplicateChar(str);
       Map<Character, Integer> map1= countDuplicateCharWithCollection(str);

       for(Map.Entry<Character, Integer> map : map1.entrySet()){
           if(map.getValue() > 1)
           System.out.println("Key: "+map.getKey()+" Value: "+map.getValue() );
       }
    map1.forEach((key, value)-> {if(value > 1) System.out.println("key: "+key+ " value: "+value);});
    }

    private static void countDuplicateChar(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int count = 1;
            char ch = '\0';

            for (int j = charArray.length-1; j > i; j--) {

                if(charArray[i] == charArray[j]) {
                    ch = charArray[i];
                    count++;
                }
            }
            if(ch != '\0' && count > 1) {
                System.out.println(ch);
                System.out.println(count);
            }
        }
    }
   public static Map<Character, Integer> countDuplicateCharWithCollection(String str){
        int frequency = 0;
        char[] charArray = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
       for (int i = 0; i < charArray.length; i++) {
           if(map.containsKey(charArray[i])) {
               int count = map.get(charArray[i]);
               count = ++count;
               map.put(charArray[i],count);
           }
           else
               map.put(charArray[i],1);

       }
       return map;
   }
}
