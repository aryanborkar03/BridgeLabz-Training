package com.movietime;
public class ShowSorter {

    // Insertion Sort based on time
    public static void insertionSort(Show[] shows, int size) {

        for (int i = 1; i < size; i++) {
            Show key = shows[i];
            int j = i - 1;

            while (j >= 0 &&
                   shows[j].getTotalMinutes() > key.getTotalMinutes()) {
                shows[j + 1] = shows[j];
                j--;
            }

            shows[j + 1] = key;
        }
    }
 
    public static void display(Show[] shows, int size) {
        if (size == 0) {
            System.out.println("No shows available.");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(
                (i + 1) + ". " +
                shows[i].getMovieName() +
                " | Time: " +
                shows[i].getShowTime()
            );
        }
    }
}
