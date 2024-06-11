package exceptionhandling;

public class ThrowsTest {
    public static int testExceptionDivide(int a, int b) throws ArithmeticException{
        if(a == 0 || b == 0) {
            System.out.println("Enter");
            throw new ArithmeticException();
        }
        return a/b;
    }
    public static void main(String args[]) throws  ArithmeticException{

            testExceptionDivide(10, 0);


    }

}
