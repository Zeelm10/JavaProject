package oopsConcept.encapsulation;

public class EncapsulationTest {
    public static void main(String[] args) {
        EncapsulationDemo demo = new EncapsulationDemo();
        demo.setEmpId(101);
        demo.setEmpName("Zeeshan");
        demo.setEmpAge(25);

        System.out.println("Employee Id: " + demo.getEmpId());
        System.out.println("Employee Name: " + demo.getEmpName());
        System.out.println("Employee Age: " + demo.getEmpAge());
    }
}
