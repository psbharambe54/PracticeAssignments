package stringprograms;

public class Palindrome {

    public static boolean checkPalinrome(String str){

        int left =0;
        int right = str.length() -1;

        while (left < right)
        {
            if(str.charAt(left) != str.charAt(right))
                return false;
             left++;
             right--;
        }
        return true;
    }
    public static boolean checkPalinrome(int number) {

        int original = number;
        int num = 0;
        int rem =0;
        while (number != 0)
        {
            System.out.println(number);
            rem = number % 10;
            num = (num * 10) + rem;

            number = number / 10;
        }
        System.out.println(num);
        if(num == original)
             return true;
        else
             return false;
    }

        public static void main(String[] args) {
       String test = "nayan";
       StringBuilder stringBuilder = new StringBuilder("Nayan");

       if(stringBuilder.reverse().equals(stringBuilder))
           System.out.println("palindrome");
        else
            System.out.println("not palindrome");

        int test1 = 121;

        if (checkPalinrome(test1))
        System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}
