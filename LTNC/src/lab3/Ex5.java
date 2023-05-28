package lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex5 {
    static boolean checkPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int greatestDivisor(int number) {
        for (int i = number; i > 0; i--) {
            if (number % i == 0 && i % 2 == 1) {
                return i;
            }
        }
        return 1;
    }

    static void productOfPrimes(int number) {
        ArrayList<Integer> arrayPrimes = new ArrayList<Integer>();
        for (int i = 2; i <= number;) {
            if (checkPrime(i) && number % i == 0) {
                arrayPrimes.add(i);
                number /= i;
            } else {
                i++;
            }
        }
        for (int i = 0; i < arrayPrimes.size(); i++) {
            System.out.print(arrayPrimes.get(i) + " ");
        }
        System.out.println("");

    }

    static void allSmallerPrimes(int number) {
        ArrayList<Integer> arrayPrimes = new ArrayList<Integer>();
        for (int i = 2; i < number; i++) {
            if (checkPrime(i)) {
                arrayPrimes.add(i);
            }
        }
        for (int i = 0; i < arrayPrimes.size(); i++) {
            System.out.print(arrayPrimes.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("plz input a number of prime numbers: ");
        int prime = sc.nextInt();
        System.out.print(checkPrime(prime));
        System.out.print("plz input a number get greatest divisor: ");
        int greatestDivisor = sc.nextInt();
        greatestDivisor(greatestDivisor);
        System.out.print("plz input a number get product Of Primes: ");
        int productOfPrimes = sc.nextInt();
        productOfPrimes(productOfPrimes);
        System.out.print("plz input a number get all smaller Primes: ");
        int allSmallerPrimes = sc.nextInt();
        allSmallerPrimes(allSmallerPrimes);
        sc.close();
    }
}
