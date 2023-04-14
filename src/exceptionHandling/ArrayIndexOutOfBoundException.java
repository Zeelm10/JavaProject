package exceptionHandling;

public class ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        int arr[] ={10,2,34,5};
        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        }catch (Exception e){
            System.out.println("Exception caught !! ");
            e.printStackTrace();
        }
    }
}
