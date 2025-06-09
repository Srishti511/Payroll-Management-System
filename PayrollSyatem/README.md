# Payroll Management System

A Java-based payroll management system that handles different types of employees (Manager, Developer, Intern) with their respective payment calculations.

## Features
- Add different types of employees (Manager, Developer, Intern)
- Calculate payroll based on employee type
- Input validation for employee data
- Exception handling for invalid inputs
- Maven-based project structure

## Project Structure
```
src/
├── main/
│   └── java/com/payroll/
│       ├── Employee.java
│       ├── Manager.java
│       ├── Developer.java
│       ├── Intern.java
│       └── PayrollSystem.java
└── test/
    └── java/com/payroll/
        ├── EmployeeTest.java
        └── PayrollSystemTest.java
```

## Prerequisites
- Java 8 or higher
- Maven

## How to Run
1. Clone the repository
2. Navigate to the project directory
3. Run: `mvn clean compile`
4. Execute: `mvn exec:java -Dexec.mainClass="com.payroll.PayrollSystem"`

## Testing
Run tests using: `mvn test`

## Documentation
See the `docs/` directory for UML diagrams and additional documentation.
