package controlStatement;

public class IfElseStmtClass {
    public static void checkevennumber(int number){
        if (number%2 == 0){
            System.out.println(number + " is Even Number");
        }
        else{
            System.out.println(number + " is Odd Number");
        }
    }

    public static void checkleapyear(int num){
        if (num%4 == 0){
            System.out.println(num + " is leap year");
        }
        else{
            System.out.println(num + " is not leap Year");
        }
    }

    public static void main(String[] args) {

        checkevennumber(10);
        checkevennumber(5);
        checkleapyear(2020);
        checkleapyear(2015);

    }
}
