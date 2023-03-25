package oopsConcept.objclass;

public class FindRectangleArea {
    int area;
    int length=10;
    int width=20;
    public  void area(){
         area = length * width;
         System.out.println("Area of a Circle :"+area);
    }
    public static void main(String[] args) {
        FindRectangleArea rectangleArea = new FindRectangleArea(); // created object
        rectangleArea.area();
    }
}
