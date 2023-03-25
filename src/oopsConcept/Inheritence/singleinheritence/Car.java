package oopsConcept.Inheritence.singleinheritence;

public class Car extends Vehicle {
    public Car(){
        System.out.println("This is Car default Constructor");
    }
    public Car(String make, String color, int y, String m){
        //invoking constructor of superclass
        super(make,color,y,m);
    }

    public static void main(String[] args) {
        Car c= new Car();
        Car c1 = new Car("Honda","Black",2017,"City");
        c1.printDetails();
    }
}
