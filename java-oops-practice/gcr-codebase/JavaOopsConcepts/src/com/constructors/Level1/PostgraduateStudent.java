package com.constructors.Level1;

public class PostgraduateStudent extends Student {

    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    void showDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name); // protected member accessible
        System.out.println("CGPA: " + getCGPA());
    }

    public static void main(String[] args) {
        PostgraduateStudent p1 =
                new PostgraduateStudent(101, "Aryan", 8.6);

        p1.showDetails();
        p1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + p1.getCGPA());
    }
}
