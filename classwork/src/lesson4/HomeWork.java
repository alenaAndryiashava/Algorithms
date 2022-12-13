package lesson4;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class HomeWork {
    // Задача заключается в следующем. Имеется три стержня — левый, средний и правый.
    // На левом стержне находятся n дисков, диаметры которых различны.
    // Диски упорядочены по размеру диаметра, сверху лежит наименьший, снизу — наибольший.
    // Требуется перенести диски с левого стержня на правый, используя средний стержень как вспомогательный.

    // Головоломка имеет следующие два правила:
    // 1. Вы не можете поместить больший диск на меньший диск.
    // 2. За один раз можно перемещать только один диск.

    static List<Integer> list = new ArrayList<>();


    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();


        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);

        solve(3, 1, 3, 2);
    }

    static void solve(int n, int fR, int tR, int aR) {
        if (n == 1) {
            System.out.println("Move 1 from rod " + fR + " to rod " + tR);
            return;
        }

        solve(n - 1, fR, aR, tR);
        System.out.println("Move " + n + " from rod " + fR + " to rod " + tR + " with rod " + aR);
        solve(n - 1, aR, tR, fR);
    }
}

