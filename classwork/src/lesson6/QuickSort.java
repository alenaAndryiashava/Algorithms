package lesson6;

import java.util.Arrays;

public class QuickSort {

    public static long count = 0;

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 6, 87, 1, 0, 52, 42, 1, 5, 7 };

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }




    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = findPivotIndex(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int findPivotIndex(int[] arr, int low, int high) {
        int pivot = arr[high];
        int pivotIndex = low - 1;

        for (int i = low; i < high; i++) {
            count++;

            if (arr[i] <= pivot) {
                pivotIndex++;

                int tmp = arr[pivotIndex];
                arr[pivotIndex] = arr[i];
                arr[i] = tmp;
            }
        }

        int tmp = arr[pivotIndex + 1];
        arr[pivotIndex + 1] = arr[high];
        arr[high] = tmp;

        return pivotIndex + 1;
    }
}
