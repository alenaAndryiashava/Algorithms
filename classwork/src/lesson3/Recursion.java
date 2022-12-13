package lesson3;

public class Recursion {

    public static void main(String[] args) {

        /*for (int i = 1; i < 10; i++) {
            System.out.println(fibNonRec(i));
        }*/

        /*double start = System.nanoTime();
       // System.out.println(fibRec(50));
        System.out.println(fibNonRec(1000));
        System.out.println((System.nanoTime() - start) / 1_000_000_000);*/

        System.out.println(fact(5));
    }

    static long fact(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * fact(n -1);
    }

    public static long fibRec(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        return fibRec(n - 1) + fibRec(n - 2);
    }

    public static long fibNonRec(int n) {
        long a = 1;
        long b = 1;
        long result = 1;

        if (n == 1 || n == 2) {
            return 1;
        }
        //Скидываю презентации по алгоритмам за сегодняшнее и прошлое занятия

        for (int i = 2; i < n; i++) {
            result = a + b;
            a = b;
            b = result;
        }

        return result;
    }
}