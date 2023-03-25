package controlStatement;

public class Ifelseclass {

    public static void main(String[] args) {

        int balance = 50;
        double withdraw = 10.5d;

        if (balance > withdraw){
            System.out.println("you can withdraw the amount");
        }
        else {
            System.out.println("you do not have enough balance to withdraw the amount");
        }

    }

}
