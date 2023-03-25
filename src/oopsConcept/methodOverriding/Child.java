package oopsConcept.methodOverriding;
public class Child extends Father{
    void shoot(){
        System.out.println("I am a child!! I am a left-handed shooter");
    }

    public static void main(String[] args) {
        Father father = new Father();
        father.shoot(); //parent class method will be called
        Father fc = new Child();
        fc.shoot();
    }
}
