package singleton;

public class SingletonNotThreadSafe extends Thread{

    private static SingletonNotThreadSafe instance = null;
    private String parameter;

     private SingletonNotThreadSafe(String parameter){
         this.parameter = parameter;

    }

    @Override
    public void run() {
        getInstance(this.parameter);
    }

    public static SingletonNotThreadSafe getInstance(String parametr){

         if(instance == null) {

//             synchronized (SingletonThreadSafe.class){
//                 if(instance == )
//             }
             System.out.println("creating new instance");
             return new SingletonNotThreadSafe(parametr);
         }
         else
             return instance;
         }




    public static void main(String[] args) {

       SingletonNotThreadSafe singletonNotThreadSafe = new SingletonNotThreadSafe("Thread1");

         singletonNotThreadSafe.start();
        System.out.println(singletonNotThreadSafe.parameter);

        SingletonNotThreadSafe singletonNotThreadSafe2 = new SingletonNotThreadSafe("Thread2");

        singletonNotThreadSafe2.start();
        System.out.println(singletonNotThreadSafe2.parameter);

        System.out.println(singletonNotThreadSafe == singletonNotThreadSafe2);

    }


}
