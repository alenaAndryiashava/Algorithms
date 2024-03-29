package CalcSystem;

import java.util.ArrayList;
import java.util.List;

public class CalcSystem {
    private static List<Character> getDigitalTable() {
        ArrayList<Character> digits = new ArrayList<>();
        for (char i = '0'; i <= '9'; i++) {
            digits.add(i);

        }
        for (char i = 'A'; i <= 'Z'; i++) {
            digits.add(i);

        }
        return digits;
    }

    public static String getIntRadix(int number, int radix) {
        List<Character> digits = getDigitalTable();
        if (radix < 2 || radix >= digits.size() || number < 0) {
            System.out.println("Incorrect arguments");
        }

        StringBuilder valueStr = new StringBuilder();
        while (number > 0) {
            valueStr.insert(0, digits.get(number % radix));
            number = number / radix;
        }

        return valueStr.toString();
    }

    public static String intToRoman(int num) {
        int[] keys = {1, 4, 5,  9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] values = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int i = values.length - 1;

        if (num <= 0) {
            throw new IllegalArgumentException("You can't enter negative numbers or zero!");
        }
        StringBuilder builder = new StringBuilder();
        while (num > 0) {
            while (keys[i] > num) {
                i--;
            }
            builder.append(values[i]);
            num -= keys[i];
        }
        return builder.toString();
    }


    public static void main(String[] args) {
        System.out.println(getIntRadix(255, 16));

        System.out.println(intToRoman(6));
    }
}
