package EmployeeManagementSystem;

class EmployeeNode {
    int empId;
    String name;
    double salary;
    String email;
    EmployeeNode next;

    public EmployeeNode(int empId, String name, double salary, String email) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.email = email;
        this.next = null;
    }
}

