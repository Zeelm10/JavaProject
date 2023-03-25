package oopsConcept.Inheritence.singleinheritence;

public class Vehicle {
    String company;
    String colour;
    int year;
    String model;

    //Default Constructor
    public Vehicle(){
        System.out.println("This is Vehicle Default Constructor");
    }

    // Parameterized Constructor
    public Vehicle(String make, String color, int y, String m) {
        company = make;
        colour=color;
        year =y;
        model= m;
    }
    // public method to print details
    public void printDetails() {
        System.out.println("Manufacturer: " + company);
        System.out.println("Color: " + colour);
        System.out.println("Year: " + year);
        System.out.println("Model: " + model);
    }

    public static void main(String[] args) {
     Vehicle v =new Vehicle();
     Vehicle v1 =new Vehicle("Hyundai","Black",2016,"Venue");
     v1.printDetails();
    }
}
