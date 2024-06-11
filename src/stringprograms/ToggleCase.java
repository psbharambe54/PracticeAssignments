package stringprograms;

public class ToggleCase {

    public static void main(String[] args) {
        StringBuilder result = doToggle("aPPle%");
        System.out.println(result);

    }

    private static StringBuilder doToggle(String str) {
        char[] chars = str.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if(Character.isLowerCase(chars[i]))
                result.append(Character.toUpperCase(chars[i]));
            else if(Character.isUpperCase(chars[i]))
                result.append(Character.toLowerCase(chars[i]));
                else
                    result.append(chars[i]);
        }

        return result;
    }
}
