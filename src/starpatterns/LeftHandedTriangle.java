package starpatterns;

public class LeftHandedTriangle {

    public static void main(String[] args) {
        printLeftHandTriangle();
        printLeftHandReversedTriangle();
        printLeftHandTriangleNumbers();
        printLeftHandReversedTriangleNumbers();
    }

    private static void printLeftHandReversedTriangleNumbers() {
    }

    private static void printLeftHandTriangleNumbers() {
        int count = 1;
        int max = 5;
        for (int i = 1; i <= max; i++) {

            for (int j = 1; j <= i ; j++) {

                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }



    private static void printLeftHandReversedTriangle() {
        int max = 5;
        for (int i = max; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printLeftHandTriangle() {
        int max = 5;
        for (int i = 0; i < max; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
