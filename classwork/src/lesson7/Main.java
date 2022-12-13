package lesson7;
import Lesson5.MergeSortPractice;
import lesson6.BubbleSort;
import lesson6.QuickSort;

import java.util.Arrays;
import java.util.Random;


public class Main {
    //TODO
    // 1. На основе кода из гита выполнить сравнение производительности алгоритмов bubble sort
    // и quick sort при количестве элементов в 1000, 10000, 1000000 (Опционально можно применить эти же проверки к merge sort)
    // 2. Вычислить скорость выполнения обоих алгоритмов сортировки в наносекундах
    // (использовать System.nanoTime) до и после выполнения метода

    public static void main(String[] args) {
       /* testBubble(1000);
        testBubble(10000);
        testBubble(100000);
        System.out.println("=".repeat(50));*/

        testQuick(1000);
        testQuick(1000);
        testQuick(1000);
        testQuick(1000);
        /*testQuick(10000);
        testQuick(100000);*/

        //Quick Sort, 1000: 10254 10072
        //Quick Sort, 10000: 150419 171430
        //Quick Sort, 100000: 2014781 1974068

        /*System.out.println("=".repeat(50));
        testMerge(1000);
        testMerge(10000);
        testMerge(100000);
        System.out.println("=".repeat(50));
        testDefault(1000);
        testDefault(10000);
        testDefault(100000);*/
    }

    static void testBubble(int n) {
        BubbleSort.count = 0;
        long start = System.nanoTime();
        BubbleSort.bubbleSort(generateArray(n));
        long end = System.nanoTime();
        System.out.println("Bubble Sort, " + n + ": " + BubbleSort.count + ", time: " + (end - start) / 1_000_000);
    }

    static void testQuick(int n) {
        QuickSort.count = 0;
        long start = System.nanoTime();
        QuickSort.sort(generateArray(n));
        long end = System.nanoTime();
        System.out.println("Quick Sort, " + n + ": " + QuickSort.count + ", time: " + (end - start) / 1_000_000);
    }

    static void testMerge(int n) {
        MergeSortPractice.count = 0;
        long start = System.nanoTime();
        MergeSortPractice.sort(generateArray(n));
        long end = System.nanoTime();
        System.out.println("Merge Sort, " + n + ": " + MergeSortPractice.count + ", time: " + (end - start) / 1_000_000);
    }

    static void testDefault(int n) {
        long start = System.nanoTime();
        Arrays.sort(generateArray(n));
        long end = System.nanoTime();
        System.out.println("Arrays Sort, time: " + (end - start) / 1_000_000);
    }

    static int[] generateArray(int n) {
        Random r = new Random();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt();
        }

        return arr;
    }
}