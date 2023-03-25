package oopsConcept.Inheritence.Hierarchical;

public class Employee {
    double salary = 50000;
    void displaySalary() {
        System.out.println("Employee Salary: Rs."+salary);
    }

    public static void main(String[] args) {
        // object created
        FullTimeEmployee emp1 = new FullTimeEmployee();
        InternEmployee emp2 = new InternEmployee();

        System.out.println("Salary of a full-time employee before incrementing:");
        emp1.displaySalary();

        System.out.println("Salary of an intern before incrementing:");
        emp2.displaySalary();

        // salary incremented
        emp1.incrementSalary();
        emp2.incrementSalary();

        System.out.println("Salary of a full-time employee after incrementing:");
        emp1.displaySalary();
        System.out.println("Salary of an intern after incrementing:");
        emp2.displaySalary();
    }
}
