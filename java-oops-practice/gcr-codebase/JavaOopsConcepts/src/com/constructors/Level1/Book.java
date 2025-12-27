package com.constructors.Level1;

public class Book {
	
	    String title;
	    String author;
	    double price;

	    //default constructor
	    public Book(){ 
	        title = "Unknown";
	        author = "Unknown";
	        price = 0.0;
	    }

	    //parameterized constructor
	    public Book(String t,String a,double p){
	        title = t;
	        author = a;
	        price = p;
	    }

	    public static void main(String[] args){

	        Book b1 = new Book();
	        Book b2 = new Book("Java Basics","Chetan Bhagat",499.0);

	        System.out.println(b1.title + " " + b1.author + " " + b1.price);
	        System.out.println(b2.title + " " + b2.author + " " + b2.price);
	    }
	}
