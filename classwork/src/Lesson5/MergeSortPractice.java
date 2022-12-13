package lesson5;

import java.util.Arrays;

public class MergeSortPractice {

    public static long count = 0;

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 6, 87, 1, 0, 52, 42, 1, 5, 7 };

        mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

    static void merge(int arr[], int left, int middle, int right) {
        int index1 = middle - left + 1;
        int index2 = right - middle;

        int[] arrL = new int[index1];
        int[] arrR = new int[index2];

        for (int i = 0; i < index1; i++) {
            count++;

            arrL[i] = arr[i + left];
        }

        for (int i = 0; i < index2; i++) {
            count++;

            arrR[i] = arr[middle + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < index1 && j < index2) {
            if (arrL[i] <= arrR[j]) {
                arr[k] = arrL[i];
                i++;
            } else {
                arr[k] = arrR[j];
                j++;
            }

            k++;

            count++;
        }

        while (i < index1) {
            arr[k] = arrL[i];
            i++;
            k++;

            count++;
        }

        while (j < index2) {
            arr[k] = arrR[j];
            j++;
            k++;

            count++;
        }
    }
}
