package com.payroll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PayrollSystemTest {
    private PayrollSystem payrollSystem;

    @BeforeEach
    public void setUp() {
        payrollSystem = new PayrollSystem();
    }

    @Test
    public void testAddEmployee() {
        Employee emp = new Manager("Test Manager", 5);
        payrollSystem.addEmployee(emp);
        assertFalse(payrollSystem.getEmployees().isEmpty());
        assertEquals(1, payrollSystem.getEmployees().size());
    }

    @Test
    public void testDisplayPayrollEmpty() {
        // Should not throw exception when no employees are present
        payrollSystem.displayPayroll();
    }

    @Test
    public void testCalculateTotalPayroll() {
        payrollSystem.addEmployee(new Manager("Manager", 5));
        payrollSystem.addEmployee(new Developer("Developer", 3));
        payrollSystem.addEmployee(new Intern("Intern", 1));
        
        double expectedTotal = 80000 + (5 * 3000) +  // Manager
                              60000 + (3 * 2500) +  // Developer
                              20000 + (1 * 1000);   // Intern
        
        assertEquals(expectedTotal, payrollSystem.calculateTotalPayroll(), 0.01);
    }
}
