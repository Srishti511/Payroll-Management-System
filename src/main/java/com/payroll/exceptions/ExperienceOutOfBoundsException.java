package com.payroll.exceptions;

/**
 * Exception thrown when an employee's years of experience is outside the allowed range.
 * For example, when creating an Intern with more than the maximum allowed years of experience.
 */
public class ExperienceOutOfBoundsException extends InvalidEmployeeDataException {
    /**
     * Constructs a new exception with the specified detail message.
     * @param message the detail message
     */
    public ExperienceOutOfBoundsException(String message) {
        super(message);
    }

    /**
     * Constructs a new exception with the specified detail message and cause.
     * @param message the detail message
     * @param cause the cause of the exception
     */
    public ExperienceOutOfBoundsException(String message, Throwable cause) {
        super(message, cause);
    }
}
