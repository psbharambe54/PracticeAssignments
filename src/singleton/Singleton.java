package singleton;

public class Singleton {

    private static Singleton instance;
    private String parameter;

    private Singleton(String parameter) {
        this.parameter = parameter;
    }

    public static Singleton getInstance(String parameter) {
        if (instance == null) {
            instance = new Singleton(parameter);
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton initialized with parameter: " + parameter);
    }

    public static void main(String[] args) {
        // Get the singleton instance with parameter "first"
        Singleton singleton1 = Singleton.getInstance("first");
        singleton1.showMessage(); // Output: Singleton initialized with parameter: first

        // Get the singleton instance with parameter "second"
        Singleton singleton2 = Singleton.getInstance("second");
        System.out.println(singleton1.parameter+"   "+ singleton2.parameter);


        System.out.println(singleton1.equals(singleton2));
    }
}
