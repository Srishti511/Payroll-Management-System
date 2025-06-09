package com.payroll;

/**
 * Represents an Intern employee type in the payroll system.
 * Interns have a base salary of $20,000 plus $1,000 per year of experience.
 * Maximum experience for interns is capped at 2 years.
 */
public class Intern extends Employee {
    private static final double BASE_SALARY = 20000.0;
    private static final double YEARLY_INCREMENT = 1000.0;
    private static final int MAX_EXPERIENCE = 2;

    /**
     * Creates a new Intern
     * @param name Intern's name (cannot be null or empty)
     * @param yearsOfExperience Years of experience (0-2)
     * @throws IllegalArgumentException if name is invalid or experience is outside valid range
     */
    public Intern(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
        if (yearsOfExperience > MAX_EXPERIENCE) {
            throw new IllegalArgumentException(
                String.format("Intern experience cannot exceed %d years", MAX_EXPERIENCE));
        }
    }

    /**
     * Calculates the intern's salary
     * @return calculated salary based on experience
     */
    @Override
    public double computeSalary() {
        return BASE_SALARY + (yearsOfExperience * YEARLY_INCREMENT);
    }

    @Override
    public String toString() {
        return String.format("Intern{id=%d, name='%s', yearsOfExperience=%d}", 
                           id, name, yearsOfExperience);
    }
}
