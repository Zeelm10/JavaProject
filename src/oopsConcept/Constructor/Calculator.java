package oopsConcept.Constructor;
public class Calculator {
    int num1;
    int num2;
    //Default Constructor
    public Calculator(){
        System.out.println("This is calculator's default Constructor");
    }
    //Parameterized Constructor
    public Calculator(int a, int b){
        num1=a;
        num2=b;
    }
    public void calculation(){
        System.out.println("Calculation of a Numbers:");
        System.out.println("=================================");
        int ans1 = num1 + num2;
        System.out.println("Sum of 2 number :"+ans1);
        int ans2 = num1 - num2;
        System.out.println("Sub of 2 number :"+ans2);
        int ans3 = (num1 / num2);
        System.out.println("division of 2 number :"+ans3);
        int ans4 = num1 * num2;
        System.out.println("Multiplication of 2 number :"+ans4);
    }

    public static void main(String[] args) {
        Calculator cal =new Calculator();
        Calculator cal1 = new Calculator(20,10);
        cal1.calculation();
    }
}
