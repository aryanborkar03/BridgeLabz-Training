package com.constructors.Level1;

public class Vehicle {
	    
	
	// instance variable
	    String ownerName;          
	    String vehicleType;        
	    
	 // class variable
	    static int registrationFee = 5000;   

	    // constructor
	    Vehicle(String owner, String type) {
	        ownerName = owner;
	        vehicleType = type;
	    }

	    // instance method
	    void displayVehicleDetails() {
	        System.out.println(ownerName);
	        System.out.println(vehicleType);
	        System.out.println(registrationFee);
	    }

	    // class method
	    static void updateRegistrationFee(int fee) {
	        registrationFee = fee;
	    }

	    public static void main(String[] args) {
	        Vehicle v1 = new Vehicle("Rahul", "Car");
	        Vehicle v2 = new Vehicle("Amit", "Bike");

	        Vehicle.updateRegistrationFee(6000);

	        v1.displayVehicleDetails();
	        v2.displayVehicleDetails();
	    }
	
}