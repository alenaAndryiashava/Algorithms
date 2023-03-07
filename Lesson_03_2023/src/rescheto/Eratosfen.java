package rescheto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Eratosfen {
    public static void main(String[] args) {
        System.out.println(eratosfen(121));
        System.out.println(isPrime(8));
    }

    public static List<Integer> eratosfen (int max) {   //O(log n)
        boolean[] isPrime = new boolean[max];
        Arrays.fill(isPrime, true);

        for (int i = 2; (i * i) < max; i++) {
            if(isPrime[i]){
                for (int j = (2 * i); j < max; j+=i) {
                    isPrime[j] = false;

                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < max; i++) {
            if(isPrime[i]){
                primes.add(i);

            }

        }
        return primes;
    }

    private static boolean isPrime(int number){
        if (number < 2){
            return false;
        }
        if (number % 2 == 0){
            return number ==2;
        }
        if (number % 3 == 0){
            return number == 3;
        }
        for(int i = 5; (i * i) <= number; i+=6){
            if(number %i == 0 || number % (i + 2) ==0){
                return false;
            }
        }
        return true;
    }
}
