package com.payroll;

/**
 * Base abstract class representing an Employee in the payroll system.
 * Contains common properties and methods for all employee types.
 */
public abstract class Employee {
    protected static int nextId = 1;
    
    protected final int id;
    protected String name;
    protected int yearsOfExperience;

    /**
     * Constructor for creating an Employee
     * @param name Employee's name (cannot be null or empty)
     * @param yearsOfExperience Years of experience (must be >= 0)
     * @throws IllegalArgumentException if name is invalid or yearsOfExperience is negative
     */
    public Employee(String name, int yearsOfExperience) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Employee name cannot be empty");
        }
        if (yearsOfExperience < 0) {
            throw new IllegalArgumentException("Years of experience cannot be negative");
        }
        
        this.id = nextId++;
        this.name = name.trim();
        this.yearsOfExperience = yearsOfExperience;
    }

    /**
     * Abstract method to calculate salary
     * @return calculated salary amount
     */
    public abstract double computeSalary();

    /**
     * Displays employee information
     */
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Experience: " + yearsOfExperience + " years");
        System.out.printf("Salary: $%,.2f%n", computeSalary());
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getYearsOfExperience() { return yearsOfExperience; }
}
