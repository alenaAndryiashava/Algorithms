package Homework;

public class HomeWorkLegacy {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            method(i);
        }
    }


    static void method(int n) {
        int count = 0;

        for (int i = 0; i < n / 2; i++) {
            for (int j = 1; j + n / 2 <= n; j++) {
                for (int k = 1; k <= n; k = k * 2) {
                    count++;
                    //System.out.println("I am expert!");
                }
            }
        }

        System.out.println(count + " " + n + " " + n * n + " " + " " + n * n * n + " " + (n * n) / 4 * Math.log(n));
    }
}
