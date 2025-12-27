package com.constructors.Level1;

public class Student {

    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int r, String n, double c) {
        rollNumber = r;
        name = n;
        CGPA = c;
    }

    public void setCGPA(double c) {
        CGPA = c;
    }

    public double getCGPA() {
        return CGPA;
    }

    public static void main(String[] args) {
        PostgraduateStudent p1 =
                new PostgraduateStudent(101, "Rahul", 8.5);

        System.out.println(p1.getCGPA());
        p1.showDetails();
    }
}

class PostgraduateStudent extends Student {

    PostgraduateStudent(int r, String n, double c) {
        super(r, n, c);
    }

    void showDetails() {
        System.out.println(rollNumber);
        System.out.println(name);
    }
}
