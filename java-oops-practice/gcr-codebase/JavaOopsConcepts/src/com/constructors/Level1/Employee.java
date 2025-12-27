package com.constructors.Level1;

public class Employee {

    public int employeeID;
    protected String department;
    private double salary;

    // constructor
    public Employee(int id, String dept, double sal) {
        employeeID = id;
        department = dept;
        salary = sal;
    }

    // public method to modify salary
    public void setSalary(double sal) {
        salary = sal;
    }

    // getter for salary
    public double getSalary() {
        return salary;
    }

    // ✅ main is in the public class
    public static void main(String[] args) {
        Manager m1 = new Manager(201, "IT", 60000);

        System.out.println(m1.getSalary());
        m1.showDetails();
    }
}

class Manager extends Employee {

    Manager(int id, String dept, double sal) {
        super(id, dept, sal);
    }

    void showDetails() {
        System.out.println(employeeID);
        System.out.println(department);
    }
}
