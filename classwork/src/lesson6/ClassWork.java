package lesson6;

import java.util.Arrays;

public class ClassWork {

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 6, 87, 1, 0, 52, 42, 1, 5, 7 };

        // {1, 2, 3, 1, 4, 5 }

        mergeSort(arr);

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr) {
        int length = arr.length;

        for (int size = 1; size <= length - 1; size = size * 2) {
            for (int left = 0; left < length - 1; left += size * 2) {
                int middle = Math.min(left + size - 1, length - 1);       // Вычислить значение right
                int right = Math.min(left + size * 2 - 1, length - 1);    // Вычислить значение middle

                merge(arr, left, middle, right);
            }
        }
    }

    static void merge(int arr[], int left, int middle, int right) {
        int index1 = middle - left + 1;
        int index2 = right - middle;

        int[] arrL = new int[index1];
        int[] arrR = new int[index2];

        for (int i = 0; i < index1; i++) {
            arrL[i] = arr[i + left];
        }

        for (int i = 0; i < index2; i++) {
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
        }

        while (i < index1) {
            arr[k] = arrL[i];
            i++;
            k++;
        }

        while (j < index2) {
            arr[k] = arrR[j];
            j++;
            k++;
        }
    }
}
