package com.constructors.Level1;

public class Manager extends Employee {

    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    void showDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department); // protected access
        System.out.println("Salary: " + getSalary());
    }

    public static void main(String[] args) {
        Manager m1 = new Manager(201, "IT", 60000);

        m1.showDetails();
        m1.setSalary(70000);
        System.out.println("Updated Salary: " + m1.getSalary());
    }
}
