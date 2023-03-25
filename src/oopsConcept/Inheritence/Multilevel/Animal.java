package oopsConcept.Inheritence.Multilevel;

public class Animal {
    public void sound(){
        System.out.println("Animals can make sound");
    }
    public void eat(){
        System.out.println("All animal can eat");
    }

    public static void main(String[] args) {
        Animal a =new Animal();
        a.eat();
        a.sound();
    }
}
