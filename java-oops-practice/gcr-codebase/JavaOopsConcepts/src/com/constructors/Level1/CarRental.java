package com.constructors.Level1;

public class CarRental {
	
	    String customerName;
	    String carModel;
	    int rentalDays;
	    int costPerDay = 1000;

	    // constructor
	    CarRental(String name, String model, int days) {
	        customerName = name;
	        carModel = model;
	        rentalDays = days;
	    }

	    // method to calculate total cost
	    int calculateTotalCost() {
	        return rentalDays * costPerDay;
	    }

	    public static void main(String[] args) {
	        CarRental c1 = new CarRental("Aryan", "Swift", 3);

	        System.out.println("Total Cost: " + c1.calculateTotalCost());
	    }
	}


