public class Main {
    public static void main(String[] args) {


        System.out.println(isPalindrome("car")); //-->false
        System.out.println(isPalindrome("carac"));//-->true
        System.out.println(isPalindrome("carrac"));//-->true
        System.out.println(isPalindrome("carsac"));//-->false
    }
    // TODO: поменять местами значения а и в
    static void task2(int a, int b){

        int tmp = a;
        a = b;
        b = tmp;
        System.out.println(a + " " + b);

        // TODO: поменять местами значения а и в, не используя третью переменную

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }

    // TODO: написать метод, который будет проверять, является ли строка палиндромом
    static boolean isPalindrome(String s) {
        //System.out.println(s.charAt(0) == s.charAt(s.length() - 1));

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}