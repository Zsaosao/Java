package lab3;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("plz input a number: ");
        int number = sc.nextInt();
        sc.close();
        int sum = 0;
        int product = 1;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        for (int i = 1; i <= number; i++) {
            product *= i;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
