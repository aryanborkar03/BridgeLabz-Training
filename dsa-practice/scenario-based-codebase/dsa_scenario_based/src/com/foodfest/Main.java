package com.foodfest;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println(" FoodFest – Stall Footfall Report ");
        System.out.println("=================================");

        System.out.print("Enter total number of stalls: ");
        int n = sc.nextInt();
        sc.nextLine();

        Stall[] stalls = new Stall[n];

        System.out.println("\nEnter stall details :");
        for (int i = 0; i < n; i++) {
            System.out.print("Stall name: ");
            String name = sc.nextLine();

            System.out.print("Footfall count: ");
            int footfall = sc.nextInt();
            sc.nextLine();

            stalls[i] = new Stall(name, footfall);
        }

        System.out.println("\nBefore Merging:");
        FootfallMerger.display(stalls);

        FootfallMerger.mergeSort(stalls, 0, n - 1);

        System.out.println("\nMaster List :");
        FootfallMerger.display(stalls);

        sc.close();
    }
}
