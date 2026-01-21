package com.medwarehouse;
public class ExpirySorter {

    // Merge Sort (earliest expiry first)
    public static void mergeSort(Medicine[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(Medicine[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Medicine[] L = new Medicine[n1];
        Medicine[] R = new Medicine[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Stable merge based on expiry date
        while (i < n1 && j < n2) {
            if (L[i].getExpiryDate() <= R[j].getExpiryDate()) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    public static void display(Medicine[] arr) {
        for (Medicine m : arr) {
            System.out.println(
                m.getName() + " | Expiry: " + m.getExpiryDate()
            );
        }
    }
}
