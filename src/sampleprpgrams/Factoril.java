package sampleprpgrams;

public class Factoril {
    public static void main(String[] args) {
        int num = factorial(1);
        System.out.println(num);

    }

    private static int factorial(int i) {
         if( i == 0)
             return 1;
         else
             return i * factorial(i-1);
    }
}
