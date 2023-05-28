package lab3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Plz input number: ");
        int n = sc.nextInt();
        sc.close();
        int copyN = n;
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        System.out.println("The number of digits of the integer is: " + count);

        int reverseNumber = 0;
        for (int i = 0; i < count; i++) {
            int reverseValue = copyN % 10;
            reverseNumber += reverseValue * (Math.pow(10, (count - i - 1)));
            copyN /= 10;
        }
        System.out.println("Reverse Number: " + reverseNumber);

    }
}
