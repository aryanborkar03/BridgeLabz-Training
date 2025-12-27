package com.constructors.Level1;

public class Circle {

    double radius;

    //default constructor
    public Circle(){
        this(1.0);
    }

    //parameterized constructor
    public Circle(double r){
        radius = r;
    }

    
    public static void main(String[] args){

        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);

        System.out.println(c1.radius);
        System.out.println(c2.radius);
    }
}
