package com.constructors.Level1;

public class Book2 {
	
	    String title;
	    String author;
	    double price;
	    boolean available;

	    // constructor
	    Book2(String t, String a, double p) {
	        title = t;
	        author = a;
	        price = p;
	        available = true;
	    }

	    // method to borrow book
	    void borrowBook() {
	        if (available) {
	            available = false;
	            System.out.println("Book borrowed ");
	        } else {
	            System.out.println("Book is not available");
	        }
	    }

	    public static void main(String[] args) {
	        Book2 b1 = new Book2("Java Basics", "James", 450);

	        b1.borrowBook();
	        b1.borrowBook();
	    }
	
}