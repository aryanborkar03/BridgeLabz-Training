package com.sorting.mergesort;

import java.util.Arrays;

public class MergeSortBookPrices {

    public static void main(String[] args) {

        int[] bookPrices = {876, 65, 4, 123, 554, 777};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bookPrices));

        MergeSort.sort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("After Sorting (Ascending):");
        System.out.println(Arrays.toString(bookPrices));
    }
}
