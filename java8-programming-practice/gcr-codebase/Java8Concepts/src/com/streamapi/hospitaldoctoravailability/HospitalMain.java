package com.streamapi.hospitaldoctoravailability;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HospitalMain {
	public static void main(String[] args) {
        
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Raj", "Cardiology", Arrays.asList("Monday", "Wednesday", "Friday")),
            new Doctor("Rudra", "Dermatology", Arrays.asList("Saturday", "Sunday")),
            new Doctor("Rudresh", "Neurology", Arrays.asList("Tuesday", "Thursday", "Saturday")),
            new Doctor("Raman", "Pediatrics", Arrays.asList("Monday", "Sunday")),
            new Doctor("Rama", "Cardiology", Arrays.asList("Saturday", "Sunday")),
            new Doctor("Rupesh", "Dermatology", Arrays.asList("Monday", "Tuesday"))
        );

        System.out.println("--- Weekend Doctors (Sorted by Specialty) ---");

        List<Doctor> weekendDoctors = doctors.stream()            
            .filter(doc -> doc.getAvailableDays().contains("Saturday") 
                        || doc.getAvailableDays().contains("Sunday"))
            .sorted(Comparator.comparing(Doctor::getSpecialty))
            .collect(Collectors.toList());

        weekendDoctors.forEach(System.out::println);
    }
}
