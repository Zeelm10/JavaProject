package oopsConcept.Inheritence.Multilevel;

public class Dog extends Animal{

    public void bark(){
        System.out.println("Dog can bark");
    }
    public void animalsound(){
        System.out.println("Dog says: bow bow");
    }

    public static void main(String[] args) {
        Dog d= new Dog();
        d.sound();
        d.eat();
        d.bark();
        d.animalsound();
    }
}
