package stringprograms;

import java.util.Arrays;

public class AnagramTest {

    public static boolean checkAnagram(String s1,String s2){

        if(s1.length() != s2.length())
            return false;

        char[] s1charArray = s1.toCharArray();
        char[] s2charArray = s2.toCharArray();
        Arrays.sort(s1charArray);
        Arrays.sort(s2charArray);

        if(Arrays.equals(s1charArray, s2charArray))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(checkAnagram("top","pot"));
    }
}
