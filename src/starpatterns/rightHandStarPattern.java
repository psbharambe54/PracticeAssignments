package starpatterns;

public class rightHandStarPattern {
    public static void main(String[] args) throws InterruptedException {
//        leftHandedTriangle();
        System.out.println();
        leftHandedTrianbleReversed();
//        sample();
    }

    private static void sample() {
        int rows = 5;
        for (int i = rows; i > 0; i--) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    private static void leftHandedTrianbleReversed() throws InterruptedException {
        int max = 5;
        for (int i = max; i > 0; i--) {
            for (int j = max-i; j > 0; j--) {
                Thread.sleep(500);
                System.out.print(" j");
            }
            for (int k = 0; k < i; k++) {
                Thread.sleep(500);
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void leftHandedTriangle() throws InterruptedException {
        int max = 5;
        for (int i = 0; i < max; i++) {

            for (int j = i; j < max-1; j++) {
                Thread.sleep(500);
                System.out.print("  ");
            }
            for (int k = 0; k <= i ; k++) {
                Thread.sleep(500);
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
