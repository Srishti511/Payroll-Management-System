package com.payroll;

/**
 * Represents a Manager employee type in the payroll system.
 * Managers have a base salary of $80,000 plus $3,000 per year of experience.
 */
public class Manager extends Employee {
    private static final double BASE_SALARY = 80000.0;
    private static final double YEARLY_INCREMENT = 3000.0;

    /**
     * Creates a new Manager
     * @param name Manager's name (cannot be null or empty)
     * @param yearsOfExperience Years of experience (must be >= 0)
     * @throws IllegalArgumentException if name is invalid or yearsOfExperience is negative
     */
    public Manager(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
    }

    /**
     * Calculates the manager's salary
     * @return calculated salary based on experience
     */
    @Override
    public double computeSalary() {
        return BASE_SALARY + (yearsOfExperience * YEARLY_INCREMENT);
    }

    @Override
    public String toString() {
        return String.format("Manager{id=%d, name='%s', yearsOfExperience=%d}", 
                           id, name, yearsOfExperience);
    }
}
