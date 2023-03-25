package controlStatement;
public class LeapYear {
    public static void checkleapyear(int num){
        if (num%4 == 0 && (num%100 != 0 || num%400 ==0) ){
            System.out.println(num + " is leap year");
        }
        else{
            System.out.println(num + " is not leap Year");
        }
    }
    public static void main(String[] args) {
         checkleapyear(2022); // leap year
         checkleapyear(2015); // not leap year
    }
}
