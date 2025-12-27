package com.constructors.Level1;

public class Student {
    public int rollNumber;
    protected String name;
    private double cgpa; // private to restrict direct access

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // public methods to access and modify CGPA
    public double getCGPA() {
        return cgpa;
    }

    public void setCGPA(double cgpa) {
        if (cgpa >= 0 && cgpa <= 10) {
            this.cgpa = cgpa;
        }
    }
}
