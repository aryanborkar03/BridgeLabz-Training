package com.constructors.Level1;

public class Employee {
    public int employeeID;
    protected String department;
    private double salary; // private to control access

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // public method to modify salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }
}
