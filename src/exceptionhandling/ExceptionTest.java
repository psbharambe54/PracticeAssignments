package exceptionhandling;

public class ExceptionTest {
        public static int testExceptionDivide(int a, int b) throws ArithmeticException{
            if(a == 0 || b == 0) {
                System.out.println("Enter");
                throw new ArithmeticException();
            }
            return a/b;
        }
        public static void main(String args[]) {
            try{
                testExceptionDivide(10, 0);
            }
            catch(ArithmeticException e){
                System.out.println("Exception caught");
            }
        }


}
