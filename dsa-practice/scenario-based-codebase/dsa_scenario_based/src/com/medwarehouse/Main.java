package com.medwarehouse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println(" MedWarehouse – Expiry Tracker ");
        System.out.println("=================================");

        System.out.print("Enter total number of medicines: ");
        int n = sc.nextInt();
        sc.nextLine();

        Medicine[] medicines = new Medicine[n];

        System.out.println("\nEnter medicine details :");
        for (int i = 0; i < n; i++) {
            System.out.print("Medicine name: ");
            String name = sc.nextLine();

            System.out.print("Expiry date (YYYYMMDD): ");
            int expiry = sc.nextInt();
            sc.nextLine();

            medicines[i] = new Medicine(name, expiry);
        }

        System.out.println("\nBefore Merging:");
        ExpirySorter.display(medicines);

        ExpirySorter.mergeSort(medicines, 0, n - 1);

        System.out.println("\nAfter Sorting (Earliest Expiry First):");
        ExpirySorter.display(medicines);

        sc.close();
    }
}
