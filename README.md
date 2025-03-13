CRUDemo - Java Employee CRUD Application
CRUDemo is a simple console-based Java application that demonstrates CRUD (Create, Read, Update, Delete) operations on an employee collection using an ArrayList. This project is ideal for beginners looking to understand basic Java programming, data structures, and interactive console applications.

Features
Insert Employee: Add a new employee record with an employee number, name, and salary.
Display Employees: List all employee records.
Search Employee: Find an employee by their employee number.
Delete Employee: Remove an employee record by employee number.
Update Employee: Modify the details of an existing employee.
Prerequisites
Java Development Kit (JDK) 8 or higher
A code editor or IDE (e.g., IntelliJ IDEA, Eclipse, VS Code)
Basic understanding of Java programming
How to Compile and Run
Clone the Repository (if applicable):

bash
Copy
git clone https://github.com/yourusername/CRUDemo.git
cd CRUDemo
Compile the Program:

bash
Copy
javac CRUDemo.java
Run the Program:

bash
Copy
java CRUDemo
Usage
When you run the application, a menu will be displayed with the following options:

1. INSERT: Add a new employee by entering the employee number, name, and salary.
2. DISPLAY: Show all the employee records.
3. SEARCH: Search for an employee by their employee number.
4. DELETE: Delete an employee record using their employee number.
5. UPDATE: Update the name and salary of an existing employee.
0. EXIT: Close the application.
Simply enter the corresponding number for the desired operation and follow the prompts.

Code Structure
Employee Class:
Represents an employee with properties such as employee number, name, and salary. It includes getters, setters, and an overridden toString() method for easy display.

CRUDemo Class:
Contains the main method and implements a menu-driven console interface. It handles user input and performs CRUD operations on an ArrayList of Employee objects.
