package sampleprpgrams;

import java.util.Arrays;

public class PracticeStar {

    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i -1; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = num; i >= 1 ; i--) {
            for (int j = num - i; j >= 1 ; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i *2 -1; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
