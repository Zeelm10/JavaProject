package oopsConcept.methodOverloading;

public class Rectangle {
    int area;
    public void findArea(int i){
        area = i *i;
        System.out.println("Area of a rectangle:"+area);
    }
    public void findArea(int x, int y){
        area = x * y;
        System.out.println("Area of a Rectangle:"+area);
    }

    public static void main(String[] args) {
        Rectangle rectangle =new Rectangle();
        rectangle.findArea(10);
        rectangle.findArea(10,20);
    }
}
