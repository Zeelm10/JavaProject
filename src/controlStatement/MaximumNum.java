package controlStatement;
public class MaximumNum {
    public static void checkMaximumNumber(int a, int b, int c){
        if (a!=b && a!=b && b!=c){
            if(a>b && a>c){
                System.out.println(a + " is greater number");
            }else if(b>c && b>a){
                System.out.println(b + " is greater number");
            }else{
                System.out.println(c + " is greater number");
            }
        }else {
            System.out.println("Numbers are similar");
        }
    }

    public static void main(String[] args) {
        checkMaximumNumber(10,25,15);
        checkMaximumNumber(20,20,10);
    }
}
