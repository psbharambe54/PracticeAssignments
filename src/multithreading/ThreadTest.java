package multithreading;

public class ThreadTest extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5 ; i++) {
            System.out.println(currentThread().getName());
        }

    }

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        ThreadTest threadTest1 = new ThreadTest();

        threadTest.start();
        threadTest1.start();
        try{
            threadTest.join();
            System.out.println(threadTest.getName()+"finish execution");
            threadTest1.join();
            System.out.println(threadTest1.getName()+"finish execution");


        }catch (Exception e){
            System.out.println("Exception caught");
        }


    }


}
