package com.artexpo;
public class ArtExpoManager {

    // Insertion Sort by registration time 
    public static void insertionSort(Artist[] artists, int size) {

        for (int i = 1; i < size; i++) {
            Artist key = artists[i];
            int j = i - 1;

            while (j >= 0 &&
                   artists[j].getTotalMinutes() > key.getTotalMinutes()) {

                artists[j + 1] = artists[j];
                j--;
            }

                               artists[j + 1] = key;
        }
    }

    public static void display(Artist[] artists, int size) {
        if (size == 0) {
            System.out.println("No artists registered yet.");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(
                (i + 1) + ". " +
                artists[i].getName() +
                " | Time: " +
                artists[i].getTime()
            );
        }
    }
}
