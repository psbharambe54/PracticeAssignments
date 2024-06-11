package multithreading;

public class SynchronizedTest implements Runnable{

    public static int i = 0;
//    int num;

    public int getI() {
        synchronized (this) {
            return i = i + 1;
        }
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new SynchronizedTest());
        Thread t2 = new Thread(new SynchronizedTest());
        t1.start();
        t2.start();

    }

    @Override
    public void run() {
        int num = 0;
        for (int j = 0; j < 5; j++) {

                num = getI();
                System.out.println(num);

        }
//        System.out.println(num);
    }
}
