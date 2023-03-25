package variables;

public class Circle {

    static int radius = 5;
    static String colour ="Black";

    public  void area(){
        //area = 3.14*r*r
        float a = 3.14f * radius * radius;
        System.out.println("Area of a Circle :"+a);
    }

    public static void color() {

        System.out.println("Color of the Circle is:"+colour);
    }

    public static void circumference(){
        float c =2* 3.14f * radius;
        System.out.println("Circumference of a circle :"+c);
    }

    public static void main(String[] args) {

        System.out.println("Radius:"+radius);
        System.out.println("color:"+colour);
        Circle myobj =new Circle();
        myobj.area();
        color();
        circumference();

        }
    }


