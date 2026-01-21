package com.foodfest;
public class FootfallMerger {

    // Merge Sort (high footfall → low)
    public static void mergeSort(Stall[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(Stall[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Stall[] L = new Stall[n1];
        Stall[] R = new Stall[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Stable merge
        while (i < n1 && j < n2) {
            if (L[i].getFootfall() >= R[j].getFootfall()) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    public static void display(Stall[] arr) {
        for (Stall s : arr) {
            System.out.println(
                s.getStallName() + " | Footfall: " + s.getFootfall()
            );
        }
    }
}
