package oopsConcept.Interface;

public class MultipleInheritence {
    public static void main(String[] args) {
        Shape s;
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.calculateArea(2,4);
        r.calculateArea(4,6);
    }
}
