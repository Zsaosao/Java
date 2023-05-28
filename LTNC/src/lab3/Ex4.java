package lab3;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("plz input first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("plz input second number: ");
        int secondNumber = sc.nextInt();
        sc.close();
        int minNumber = Math.min(firstNumber, secondNumber);
        int maxNumber = Math.max(firstNumber, secondNumber);
        int gcd = 1;
        int gcm = 0;
        for (int i = minNumber; i > 0; i--) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                gcd = i;
                break;
            }
        }
        for (int i = maxNumber;; i++) {
            if (i % firstNumber == 0 && i % secondNumber == 0) {
                gcm = i;
                break;
            }
        }
        System.out.println("greatest common divisor: " + gcd);
        System.out.println("greatest common multiple: " + gcm);
    }

}
