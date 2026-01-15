package com.hospitalqueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println(" Welcome to Apollo Hospital ER ");
        System.out.println(" Patient Criticality Management ");
        System.out.println("=================================");

        System.out.print("\nEnter number of patients: ");
        int n = sc.nextInt();
        sc.nextLine();

        Patient[] patients = new Patient[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nPatient name: ");
            String name = sc.nextLine();

            int criticality;
            while (true) {
                System.out.print("Criticality (1-10): ");
                criticality = sc.nextInt();
                sc.nextLine();

                if (criticality >= 1 && criticality <= 10) {
                    break;
                } else {
                    System.out.println("Invalid criticality! Enter value between 1 and 10.");
                }
            }

            patients[i] = new Patient(name, criticality);
        }

        System.out.println("\nBefore Sorting:");
        HospitalQueue.display(patients, n);

        HospitalQueue.sortByCriticality(patients, n);

        System.out.println("\nAfter Sorting (High to Low Criticality):");
        HospitalQueue.display(patients, n);

        sc.close();
    }
}
