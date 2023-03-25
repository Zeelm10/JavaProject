public class PrimeNumber {
    public static void main(String[] args) {
        int n=3;
        int count =0;
        for(int i=2;i<=10;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==1){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not Prime");
        }
    }
}
