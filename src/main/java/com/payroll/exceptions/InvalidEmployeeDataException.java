package com.payroll.exceptions;

/**
 * Custom exception class for invalid employee data.
 * Thrown when employee data fails validation checks.
 */
public class InvalidEmployeeDataException extends RuntimeException {
    public InvalidEmployeeDataException(String message) {
        super(message);
    }

    public InvalidEmployeeDataException(String message, Throwable cause) {
        super(message, cause);
    }
}
