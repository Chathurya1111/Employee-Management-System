# 🧑‍💼 Employee Management System (Java)

This is a basic **Employee Management System** developed in Java as part of a practical coursework project. It demonstrates object-oriented programming concepts like inheritance, polymorphism, and method overriding by modeling different types of employees.

## 📌 Project Description

The system defines a base `Employee` class and extends it to represent:
- **Full-Time Employees**
- **Part-Time Employees**
- **Interns**

Each subclass includes specific methods to calculate salaries or stipends and overrides the `displayDetails()` method to show complete information for that employee type.

## ✨ Features

- Add and manage different employee types
- Calculate:
  - Annual salary for full-time employees
  - Pay based on hours worked for part-time employees
  - Stipend over a set period for interns
- Override methods to provide detailed output per employee type

## 📂 Class Structure

```java
- Employee (Base Class)
  - FullTimeEmployee
  - PartTimeEmployee
  - Intern
- EmployeeManagementSystem (Main class)
