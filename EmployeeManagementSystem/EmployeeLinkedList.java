package EmployeeManagementSystem;

class EmployeeLinkedList {
    private EmployeeNode head;

    public EmployeeLinkedList() {
        head = null;
    }

    public String addEmployee(int empId, String name, double salary, String email) {
        if (findEmployee(empId) != null) {
            return "Error: Employee ID already exists.";
        }

        EmployeeNode newNode = new EmployeeNode(empId, name, salary, email);
        if (head == null) {
            head = newNode;
        } else {
            EmployeeNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return "Employee registered successfully.";
    }

    public EmployeeNode findEmployee(int empId) {
        EmployeeNode current = head;
        while (current != null) {
            if (current.empId == empId) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public String displayAllEmployees() {
        if (head == null) {
            return "No employees found.";
        }

        StringBuilder employees = new StringBuilder();
        EmployeeNode current = head;
        while (current != null) {
            employees.append("ID: ").append(current.empId)
                    .append(", Name: ").append(current.name)
                    .append(", Salary: ").append(current.salary)
                    .append(", Email: ").append(current.email)
                    .append("\n");
            current = current.next;
        }
        return employees.toString();
    }
}

