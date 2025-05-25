import java.util.ArrayList;

// Base class: Employee
abstract class Employee {
    protected String name;
    protected int yearsOfExperience;

    public Employee(String name, int yearsOfExperience) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }

    // Method to be overridden by subclasses
    public abstract double computeSalary();

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Experience: " + yearsOfExperience + " years");
        System.out.println("Salary: $" + computeSalary());
        System.out.println("-----------------------------");
    }
}

// Manager class
class Manager extends Employee {
    public Manager(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
    }

    @Override
    public double computeSalary() {
        return 80000 + (yearsOfExperience * 3000);
    }
}

// Developer class
class Developer extends Employee {
    public Developer(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
    }

    @Override
    public double computeSalary() {
        return 60000 + (yearsOfExperience * 2500);
    }
}

// Intern class
class Intern extends Employee {
    public Intern(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
    }

    @Override
    public double computeSalary() {
        return 20000 + (yearsOfExperience * 1000);
    }
}

// Main payroll system class
public class PayrollSystem {
    public static void main(String[] args) {
        // Creating a list of employees
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Manager("Alice", 5));
        employees.add(new Developer("Bob", 3));
        employees.add(new Intern("Charlie", 1));
        employees.add(new Developer("Diana", 6));
        employees.add(new Manager("Ethan", 2));

        // Displaying payroll information
        System.out.println("Payroll System\n=============================");
        for (Employee emp : employees) {
            emp.displayInfo(); // Polymorphic behavior
        }
    }
} 