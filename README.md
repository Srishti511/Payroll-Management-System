# Java Payroll System

## Description

This is a simple Java console application that demonstrates a basic payroll system. It showcases object-oriented programming principles like inheritance and polymorphism to calculate and display salaries for different types of employees (Managers, Developers, and Interns).

## Code Structure

The project consists of the following Java classes:

- `Employee.java`: An abstract base class for all employee types. It defines common properties like `name` and `yearsOfExperience`, and an abstract method `computeSalary()` which must be implemented by subclasses. It also includes a `displayInfo()` method to print employee details.
- `Manager.java`: A subclass of `Employee`. It overrides `computeSalary()` to calculate a manager's salary.
- `Developer.java`: A subclass of `Employee`. It overrides `computeSalary()` to calculate a developer's salary.
- `Intern.java`: A subclass of `Employee`. It overrides `computeSalary()` to calculate an intern's salary.
- `PayrollSystem.java`: The main class containing the `main` method. It creates a list of various employees and then iterates through the list to display their information and calculated salaries.

## How to Compile and Run

### Prerequisites

- Java Development Kit (JDK) installed and configured.

### Compilation

Open a terminal or command prompt, navigate to the directory where the `.java` files are saved (e.g., `/c:/nirbhay/Downloads/imp/`), and run the following command to compile all the Java files:

```bash
javac *.java
```

Or, if you only want to compile the main file and its dependencies:

```bash
javac PayrollSystem.java
```

### Execution

After successful compilation, run the program using the following command:

```bash
java PayrollSystem
```

This will execute the `main` method in the `PayrollSystem` class and display the payroll information for the predefined list of employees on the console.
