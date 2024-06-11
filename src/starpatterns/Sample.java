package starpatterns;

public class Sample {
    public static void main(String[] args) throws InterruptedException {
        int num=5;

        for (int i = num; i > 0; i--) {

            for (int j = 0; j < i-1; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= num; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = num; i > 0; i--) {

            for (int j = num-i; j > 0 ; j--) {
                 Thread.sleep(500);
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                Thread.sleep(500);
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
