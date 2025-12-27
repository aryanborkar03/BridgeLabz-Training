package com.constructors.Level1;

public class Person {
	    String name;
	    int age;

	    // parameterized constructor
	    Person(String n, int a) {
	        name = n;
	        age = a;
	    }

	    // copy constructor
	    Person(Person p) {
	        name = p.name;
	        age = p.age;
	    }

	    void display() {
	        System.out.println(name);
	        System.out.println(age);
	    }

	    public static void main(String[] args) {
	        Person p1 = new Person("Aryan", 22);
	        Person p2 = new Person(p1);   // cloning p1 into p2

	        p2.display();
	    }
	}


