package oopsConcept.Interface;

class Rectangle implements Shape{
    @Override
    public void calculateArea(float x, float y) {
        System.out.println("Area of a Rectangle:"+(x*y));
    }

}
