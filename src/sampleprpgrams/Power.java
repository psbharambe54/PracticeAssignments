package sampleprpgrams;

public class Power {

    public static void main(String[] args) {
        double num = power(4, 3);
        System.out.println(num);
        System.out.println(Math.pow(5, 3));
    }

    private static double power(int i, int pow) {
        double result = 1;
        if(i == 0)
            return 1.0;
        for (int j = 1; j <= pow ; j++) {
            result *= i;
        }
        return result;
    }
}
