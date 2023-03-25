package loopStatments;

public class whileLoop {
    public static void sumNum(){
        int x =1;
        int sum =0;
        while(x<=5){
            sum = sum +x;
            x++;
        }
        System.out.println(" Sum of Numbers :"+sum);
    }
    public static void main(String[] args) {
        sumNum();
    }
}
