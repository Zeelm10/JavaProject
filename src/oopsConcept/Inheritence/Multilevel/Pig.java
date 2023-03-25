package oopsConcept.Inheritence.Multilevel;
public class Pig extends Dog{
    public void pigsound() {
        System.out.println("pig says :WEE WEE");
    }

    public static void main(String[] args) {
        Pig p= new Pig();
        p.eat();
        p.animalsound();
        p.sound();
        p.pigsound();
        p.bark();
    }
}

