package com.payroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Main class for the Payroll System application.
 * Manages a collection of employees and provides payroll functionality.
 */
public class PayrollSystem {
    private final List<Employee> employees;
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Creates a new PayrollSystem with an empty list of employees
     */
    public PayrollSystem() {
        this.employees = new ArrayList<>();
    }

    /**
     * Adds an employee to the payroll system
     * @param employee the employee to add
     * @throws IllegalArgumentException if employee is null
     */
    public void addEmployee(Employee employee) {
        if (employee == null) {
            throw new IllegalArgumentException("Employee cannot be null");
        }
        employees.add(employee);
    }

    /**
     * Displays payroll information for all employees
     */
    public void displayPayroll() {
        if (employees.isEmpty()) {
            System.out.println("No employees in the system.");
            return;
        }

        System.out.println("\n=== Payroll Report ===");
        System.out.printf("%-5s %-20s %-12s %12s%n", "ID", "Name", "Experience", "Salary");
        System.out.println("-".repeat(55));
        
        for (Employee emp : employees) {
            System.out.printf("%-5d %-20s %-12d $%,10.2f%n",
                    emp.getId(),
                    emp.getName(),
                    emp.getYearsOfExperience(),
                    emp.computeSalary());
        }
        
        System.out.println("-".repeat(55));
        System.out.printf("Total employees: %d%n", employees.size());
        System.out.printf("Total payroll: $%,.2f%n", calculateTotalPayroll());
    }

    /**
     * Calculates the total payroll for all employees
     * @return the total salary amount for all employees
     */
    public double calculateTotalPayroll() {
        return employees.stream()
                .mapToDouble(Employee::computeSalary)
                .sum();
    }

    /**
     * Gets the list of employees
     * @return an unmodifiable list of employees
     */
    public List<Employee> getEmployees() {
        return List.copyOf(employees);
    }

    /**
     * Main method to run the payroll system
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        PayrollSystem payroll = new PayrollSystem();
        boolean running = true;
        
        System.out.println("=== Payroll System ===");
        
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Employee");
            System.out.println("2. View Payroll");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());
                
                switch (choice) {
                    case 1 -> addNewEmployee(payroll);
                    case 2 -> payroll.displayPayroll();
                    case 3 -> {
                        System.out.println("Exiting...");
                        running = false;
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void addNewEmployee(PayrollSystem payroll) {
        try {
            System.out.println("\nAdd New Employee");
            System.out.println("1. Manager");
            System.out.println("2. Developer");
            System.out.println("3. Intern");
            System.out.print("Select employee type: ");
            
            int type = Integer.parseInt(scanner.nextLine().trim());
            
            System.out.print("Enter name: ");
            String name = scanner.nextLine().trim();
            
            System.out.print("Enter years of experience: ");
            int years = Integer.parseInt(scanner.nextLine().trim());
            
            Employee employee = switch (type) {
                case 1 -> new Manager(name, years);
                case 2 -> new Developer(name, years);
                case 3 -> new Intern(name, years);
                default -> throw new IllegalArgumentException("Invalid employee type");
            };
            
            payroll.addEmployee(employee);
            System.out.println("Employee added successfully!");
            
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numbers for selection and years of experience.");
        } catch (Exception e) {
            System.out.println("Error adding employee: " + e.getMessage());
        }
    }
}
