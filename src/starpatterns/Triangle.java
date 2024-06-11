package starpatterns;

public class Triangle {

    public static void main(String[] args) {
       printTrangle();
        System.out.println();
       printReversedTrangle();
    }

    private static void printReversedTrangle() {
        int max = 5;
        for (int i = max; i >0; i--) {
            for (int j = max-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printTrangle() {
        int max = 5;
        for (int i = 0; i < max; i++) {
            for (int j = i; j < max-1; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
