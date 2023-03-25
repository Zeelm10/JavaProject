package oopsConcept.Inheritence.Hierarchical;

public class InternEmployee extends Employee{
    double hike = 0.25;
    void incrementSalary() {
        salary = salary + (salary * hike);
    }
}
