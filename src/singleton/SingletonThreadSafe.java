package singleton;

public class SingletonThreadSafe implements Runnable {

    private static SingletonThreadSafe instance = null;
    private String parameter;

    private SingletonThreadSafe(String parameter){
        this.parameter = parameter;

    }

    @Override
    public void run() {
        getInstance(this.parameter);
    }

    public static SingletonThreadSafe getInstance(String parametr){

        if(instance == null) {

            synchronized (SingletonThreadSafe.class) {
                if(instance == null) {
                    System.out.println("creating new instance");
                    instance= new SingletonThreadSafe(parametr);
                }
            }
        }

            return instance;
    }




    public static void main(String[] args) {

        SingletonThreadSafe singletonThreadSafe = new SingletonThreadSafe("Thread1");
        Thread thread = new Thread(singletonThreadSafe);

        thread.start();
        thread.run();
        System.out.println(singletonThreadSafe.parameter);

        SingletonThreadSafe singletonThreadSafe2 = new SingletonThreadSafe("Thread2");
        Thread thread2 = new Thread(singletonThreadSafe2);
        thread2.start();
        thread2.run();
        System.out.println(singletonThreadSafe2.parameter);

        System.out.println(singletonThreadSafe == singletonThreadSafe2);

    }
}
