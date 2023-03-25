package oopsConcept.Constructor;
public class EmployeeClass {
    int empId;
    String empName;
    int salary;
    String department;
    //Default Constructor
    public EmployeeClass() {
        System.out.println("This is Employee class Default Constructor");
    }
    public void display() {
        System.out.println("Hellooo.....!");
        System.out.println("Employee Details:");
        System.out.println("=========================");
        System.out.println("Employee Id:" + empId);
        System.out.println("Employee Name:" + empName);
        System.out.println("Employee Salary:" + salary);
        System.out.println("Employee Department:" + department);
    }
    //Parameterized Constructor
    public EmployeeClass(int id, String name, int sal, String dept) {
        empId = id;
        empName = name;
        salary = sal;
        department = dept;
    }

    public static void main(String[] args) {
        //creating objects and passing values
        EmployeeClass emp = new EmployeeClass();
        EmployeeClass emp1 = new EmployeeClass(101, "Zeel", 30000, "IT");

        //calling method to display the values of object
        emp1.display();
    }
}
