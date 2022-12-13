package lesson4;

public class ClassWork {
    //TODO
    // найти максимальный элемент в заданном массиве.
    // Ввод: {40, 250, 80, 88, 240, 12, 148}
    // Вывод:
    // Mинимальное число в данном массиве: 12
    // Максимальное число в данном массиве: 250


    public static void main(String[] args) {
        int[] arr = {40, 250, 80, 88, 240, 12, 148};

        System.out.println("Min: " + getMin(arr, 0));
        System.out.println("Min default: " + getMinDefault(arr));
        //System.out.println("Max: " + getMax());
    }




    static int getMin(int[] arr, int index) {
        int min;

        if (arr.length > index) {
            min = getMin(arr, index + 1);

            if (arr[index] < min) {
                return arr[index];
            }
            return min;
        }
        return arr[index - 1];
    }

    /*static int getMax() {
    }*/

    static int getMinDefault(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }

        return min;
    }

}
