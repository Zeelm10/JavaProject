package oopsConcept.Interface;

class Circle implements Shape {
    @Override
    public void calculateArea(float x, float y) {
        System.out.println("Area of a Circle:"+(pi*x*y));
    }
}
