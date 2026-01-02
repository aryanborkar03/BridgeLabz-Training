package com.encapsulation.ridehailingapplication;

import java.util.ArrayList;
import java.util.List;

public class RideHailingApplication {
	public static void main(String[] args) {

        List<Vehicle> rides = new ArrayList<>();

        Vehicle car = new Car("CAR101", "Raj");
        Vehicle bike = new Bike("BIKE202", "Rajeshwar");
        Vehicle auto = new Auto("AUTO303", "Rajweshari");

        ((GPS) car).updateLocation("Sector 98");
        ((GPS) bike).updateLocation("Metro Station");
        ((GPS) auto).updateLocation("Bus Stand");

        rides.add(car);
        rides.add(bike);
        rides.add(auto);

        FareCalculator.calculateFareForRides(rides, 10);
    }
}
