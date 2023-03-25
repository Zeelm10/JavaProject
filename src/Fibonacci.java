public class Fibonacci {
    public static void fibonacci()
    {
        int sum = 0;
        int first = 0;
        int second = 1;

        for (int i = 1; i <= 10; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        System.out.println("The sum of number:"+sum);
    }
    public static void main(String[] args) {
        fibonacci();
    }
}
