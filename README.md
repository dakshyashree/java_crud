# CRUDemo - Java Employee CRUD Application

CRUDemo is a console-based Java application that demonstrates basic CRUD (Create, Read, Update, Delete) operations on an employee collection using an `ArrayList`. This project is intended for beginners learning Java programming, data structures, and interactive console applications.

---

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [How to Compile and Run](#how-to-compile-and-run)
- [Usage](#usage)
- [Code Structure](#code-structure)
---

## Features

- **Insert Employee**: Add a new employee record with an employee number, name, and salary.
- **Display Employees**: List all employee records.
- **Search Employee**: Find an employee by their employee number.
- **Delete Employee**: Remove an employee record using the employee number.
- **Update Employee**: Modify the details of an existing employee.

---

## Prerequisites

- **Java Development Kit (JDK)**: Version 8 or higher.
- **Code Editor/IDE**: Examples include IntelliJ IDEA, Eclipse, or VS Code.
- **Basic Knowledge**: Familiarity with Java programming is recommended.

---

## How to Compile and Run

1. **Clone the Repository (if applicable):**

   ```bash
   git clone https://github.com/yourusername/CRUDemo.git
   cd CRUDemo
2. **Compile the Program:**

   ```bash
   javac CRUDemo.java
3. **Run the Program:**

   ```bash
   java CRUDemo

   
## Usage

When you run the application, a menu is displayed with the following options:

1. **INSERT**:  
   Add a new employee record by providing the employee number, name, and salary.

2. **DISPLAY**:  
   Display a list of all employee records.

3. **SEARCH**:  
   Search for an employee record by entering the employee number.

4. **DELETE**:  
   Remove an employee record by providing the employee number.

5. **UPDATE**:  
   Update the name and salary of an existing employee record.

6. **EXIT (0)**:  
   Exit the application.

**Example Interaction:**

```plaintext
1. INSERT
2. DISPLAY
3. SEARCH
4. DELETE
5. UPDATE
0. EXIT
Enter your choice: 1
Enter Employee Number: 101
Enter Employee Name: Alice
Enter Employee Salary: 50000
Employee added successfully.
```


## Code Structure

### Employee Class

- **Purpose:**  
  Represents an employee with the following properties:
  - `empNo` (Employee Number)
  - `name` (Employee Name)
  - `salary` (Employee Salary)

- **Key Methods:**
  - **Getters:** Retrieve the values of `empNo`, `name`, and `salary`.
  - **Setters:** Allow updating of `name` and `salary`.
  - **toString():** Overridden method to provide a string representation of an employee for easy display.

### CRUDemo Class

- **Purpose:**  
  Contains the `main` method and implements a menu-driven console interface to perform CRUD operations on an `ArrayList` of `Employee` objects.

- **Key Functionalities:**
  - **Main Method:**  
    Entry point of the application that manages the overall flow.
  
  - **User Interaction:**  
    - Displays a menu with options to INSERT, DISPLAY, SEARCH, DELETE, and UPDATE employee records.
    - Reads user input from the console to select and execute the desired operation.
  
  - **CRUD Operations:**
    - **Insert Employee:**  
      Adds a new `Employee` object to the collection by taking input for employee number, name, and salary.
    - **Display Employees:**  
      Iterates over the collection and prints out the details of each employee.
    - **Search Employee:**  
      Searches for an employee by their employee number and displays their details if found.
    - **Delete Employee:**  
      Removes an employee from the collection based on the provided employee number.
    - **Update Employee:**  
      Updates the name and salary of an existing employee record.
