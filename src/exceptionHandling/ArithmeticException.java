package exceptionHandling;

public class ArithmeticException {
    public static void main(String[] args) {
        try{
            int result =30/0; //trying to divide by zero
            System.out.println(result);
        }catch (java.lang.ArithmeticException e){
            System.out.println("Arithmetic exception caught!!!");
            e.printStackTrace();
        }finally {
            System.out.println("Any number can not be divide by zero!!!");
        }
    }
}
