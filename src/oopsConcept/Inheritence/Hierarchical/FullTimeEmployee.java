package oopsConcept.Inheritence.Hierarchical;

public class FullTimeEmployee extends Employee{
    double hike = 0.50;
    void incrementSalary() {
        salary = salary + (salary * hike);
    }
}
