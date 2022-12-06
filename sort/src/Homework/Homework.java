package Homework;

public class Homework {
    //TODO
    // 1. Даны два целых числа x и n, напишите функцию для вычисления x^n
    // решение 1 - рекурсивно O(n)
    // решение 2 - улучшить решение 1 до O(lon n)


    public static void main(String[] args) {

       /* System.out.println(power(2, 5));
        System.out.println(power(2, 1));
        System.out.println(power(2, 10));
        System.out.println("=".repeat(50));*/

        System.out.println(powerRecImproved(2, 5));
        System.out.println(powerRecImproved(2, 1));
        System.out.println(powerRecImproved(2, 10));

        System.out.println("=".repeat(50));

        System.out.println(powerRecImproved(10, 5));
        System.out.println(powerRecImproved(10, 1));
        System.out.println(powerRecImproved(10, 10));


    }

    static long power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        long result = x;
        for (int i = 1; i < n; i++) {
            result *= x;
        }

        return result;
    }

    static long powerRec(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * powerRec(x, n - 1);
    }


    // Получение значение, равное x в степени n / 2
    // Выполнить проверку n на четность
    // Если n четное, возвести полученное число в квадрат
    // В противном случае возвести в квадрат и умножить на x
    static long powerRecImproved(int x, int n) {
        if (n == 0) {
            return 1;
        }

        long half = powerRecImproved(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

}

