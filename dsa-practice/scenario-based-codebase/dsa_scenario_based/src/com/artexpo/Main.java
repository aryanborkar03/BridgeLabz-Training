package com.artexpo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Artist[] artists = new Artist[50];
        int count = 0;

        System.out.println("=================================");
        System.out.println(" ArtExpo – Artist Registration ");
        System.out.println("=================================");

        while (true) {
            System.out.println("\n1. Register Artist");
            System.out.println("2. Show Sorted Artist List");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Artist name: ");
                    String name = sc.nextLine();

                    System.out.print("Hour (0-23): ");
                    int hour = sc.nextInt();

                    System.out.print("Minute (0-59): ");
                    int minute = sc.nextInt();
                    sc.nextLine();

                    artists[count] = new Artist(name, hour, minute);
                    count++;

                    // real-time sorting
                    ArtExpoManager.insertionSort(artists, count);

                    System.out.println("Artist registered successfully.");
                    break;

                case 2:
                    System.out.println("\nArtists Sorted by Registration Time:");
                    ArtExpoManager.display(artists, count);
                    break;

                case 3:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
