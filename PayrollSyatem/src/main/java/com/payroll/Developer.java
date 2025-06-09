package com.payroll;

/**
 * Represents a Developer employee type in the payroll system.
 * Developers have a base salary of $60,000 plus $2,500 per year of experience.
 */
public class Developer extends Employee {
    private static final double BASE_SALARY = 60000.0;
    private static final double YEARLY_INCREMENT = 2500.0;

    /**
     * Creates a new Developer
     * @param name Developer's name (cannot be null or empty)
     * @param yearsOfExperience Years of experience (must be >= 0)
     * @throws IllegalArgumentException if name is invalid or yearsOfExperience is negative
     */
    public Developer(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
    }

    /**
     * Calculates the developer's salary
     * @return calculated salary based on experience
     */
    @Override
    public double computeSalary() {
        return BASE_SALARY + (yearsOfExperience * YEARLY_INCREMENT);
    }

    @Override
    public String toString() {
        return String.format("Developer{id=%d, name='%s', yearsOfExperience=%d}", 
                           id, name, yearsOfExperience);
    }
}
