package com.constructors.Level1;

public class Product {

	
	// instance variable
	    String productName;     
	    double price;        
	    
	 // class variable
	    static int totalProducts = 0;   

	    // constructor
	    Product(String name, double p) {
	        productName = name;
	        price = p;
	        totalProducts++;
	    }

	    // instance method
	    void displayProductDetails() {
	        System.out.println(productName);
	        System.out.println(price);
	    }

	    // class method
	    static void displayTotalProducts() {
	        System.out.println(totalProducts);
	    }

	    public static void main(String[] args) {
	        Product p1 = new Product("Laptop", 50000);
	        Product p2 = new Product("Mouse", 500);

	        p1.displayProductDetails();
	        p2.displayProductDetails();

	        Product.displayTotalProducts();
	    }
	}


