package variables;

public class Mobile {

    //declaring instance variables(state)
    String name = "Iphone14";
    String color = "White";
    int price = 120000;

    // declaring methods (behaviour)
    void calling()
    {
        System.out.println("Wait, Its connecting !!!!");
    }

    void messaging()
    {
        System.out.println("You can send the message...!!");
    }

    public static void main(String[] args) {

        // creating the object to access instance variable
        Mobile iphone = new Mobile();
        System.out.println("Model Name :" + iphone.name);
        System.out.println("Color of the mobile is :" + iphone.color);
        System.out.println("Price od the Mobile is :" + iphone.price);
        //calling methods
        iphone.calling();
        iphone.messaging();
    }

}
