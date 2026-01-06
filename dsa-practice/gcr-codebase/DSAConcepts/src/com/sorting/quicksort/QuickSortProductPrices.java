package com.sorting.quicksort;

import java.util.Arrays;

public class QuickSortProductPrices {

    public static void main(String[] args) {

        int[] productPrices = {12, 450, 876, 654, 555, 888};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(productPrices));

        QuickSort.sort(productPrices, 0, productPrices.length - 1);

        System.out.println("After Sorting (Ascending):");
        System.out.println(Arrays.toString(productPrices));
    }
}
