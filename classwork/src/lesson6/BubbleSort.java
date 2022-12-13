package lesson6;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    public static long count = 0;

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 6, 87, 1, 0, 52, 42, 1, 5, 7 };

        //bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        /*int size = 1000;
        Random r = new Random();
        int[] arr2 = new int[size];
        for (int i = 0; i < size; i++) {
            arr2[i] = r.nextInt();
        }
        //System.out.println(Arrays.toString(arr2));
        test(arr);
        System.out.println(count);
        count = 0;
        test(arr2);
        System.out.println(count);*/
    }

    /*static void test(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    count++;
                }
            }
        }
    }*/

    public static void bubbleSort(int[] arr) {
        // Написать условия циклов
        // Выполнить сравнение каждого элемента с каждым
        // Если текущий элемент больше следующего, поменять их местами

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // swap elements if first > second
                count++;

                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}

