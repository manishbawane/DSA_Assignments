package EmployeeManagementSystem;

import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        EmployeeLinkedList empList = new EmployeeLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Find Employee by ID");
            System.out.println("3. Display All Employees");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter Employee ID: ");
                        int empId = scanner.nextInt();
                        scanner.nextLine(); 
                        System.out.print("Enter Employee Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Employee Salary: ");
                        double salary = scanner.nextDouble();
                        scanner.nextLine(); 
                        System.out.print("Enter Employee Email: ");
                        String email = scanner.nextLine();
                        System.out.println(empList.addEmployee(empId, name, salary, email));
                    } catch (Exception e) {
                        System.out.println("Error: Invalid input. Please enter valid details.");
                        scanner.next(); 
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Enter Employee ID to search: ");
                        int empId = scanner.nextInt();
                        EmployeeNode employee = empList.findEmployee(empId);
                        if (employee != null) {
                            System.out.println("Employee found: ID: " + employee.empId + 
                                               ", Name: " + employee.name + 
                                               ", Salary: " + employee.salary + 
                                               ", Email: " + employee.email);
                        } else {
                            System.out.println("Error: Employee not found.");
                        }
                    } catch (Exception e) {
                        System.out.println("Error: Please enter a valid Employee ID.");
                        scanner.next(); 
                    }
                    break;

                case 3:
                    System.out.println(empList.displayAllEmployees());
                    break;

                case 4:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Error: Invalid choice. Please select a valid option.");
            }
        }
    }
}

