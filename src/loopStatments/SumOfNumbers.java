package loopStatments;

public class SumOfNumbers {
    public static void summation(){
        int sum =0;
        for(int i=1; i<=50;i++){
            sum = sum+i;
        }
        System.out.println("sum of 1 to 50 is:" +sum);
    }
    public static void main(String[] args) {
        summation();
    }
}
