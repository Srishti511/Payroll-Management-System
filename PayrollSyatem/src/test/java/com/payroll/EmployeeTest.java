package com.payroll;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    public void testEmployeeCreation() {
        Employee emp = new Manager("Test Employee", 3);
        assertEquals("Test Employee", emp.getName());
        assertEquals(3, emp.getYearsOfExperience());
    }

    @Test
    public void testInvalidName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Manager("", 2);
        });
    }

    @Test
    public void testNegativeExperience() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Manager("Test", -1);
        });
    }
}
