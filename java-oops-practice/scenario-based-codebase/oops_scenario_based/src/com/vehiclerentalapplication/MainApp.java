package com.vehiclerentalapplication;
public class MainApp {

    public static void main(String[] args) {

        Customer c1 = new Customer("C101", "Aakash Sharma");
        c1.displayInfo();

        System.out.println();

        Vehicle v1 = new Bike("B001", "Yamaha ", 100, true);
        Vehicle v2 = new Car("C201", "Breeza", 2000, true);
        Vehicle v3 = new Truck("T501", "Tata Motors", 3500, 8);

        Vehicle[] vehicles = {v1, v2, v3};

        for (Vehicle v : vehicles) {
            v.displayInfo();
        }

        System.out.println("\n--- RENT DETAILS ---");

        System.out.println("Bike Rent (5 days): ₹" + v1.calculateRent(5));
        System.out.println("Car Rent (10 days): ₹" + v2.calculateRent(10));
        System.out.println("Truck Rent (3 days): ₹" + v3.calculateRent(3));
    }
}
