package com.movietime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // daily shows are limited
        Show[] shows = new Show[30]; 
        int count = 0;

        System.out.println("------------------------------");
        System.out.println(" WElcome to our app, MovieTime :");
        System.out.println("------------------------------");

        while (true) {
            System.out.println("\n1. Add Show");
            System.out.println("2. Show All Listings");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Movie name: ");
                    String name = sc.nextLine();

                    System.out.print("Hour (0–23): ");
                    int hour = sc.nextInt();

                    System.out.print("Minute (0–59): ");
                    int minute = sc.nextInt();
                    sc.nextLine();

                    shows[count] = new Show(name, hour, minute);
                    count++;

                    // real-time sorting
                    ShowSorter.insertionSort(shows, count);

                    System.out.println("Show added and sorted.");
                    break;

                case 2:
                    System.out.println("\nUpcoming Shows:");
                    ShowSorter.display(shows, count);
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
