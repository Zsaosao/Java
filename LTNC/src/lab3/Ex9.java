package lab3;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("plz input deposits: ");
        double deposits = sc.nextDouble();
        System.out.print("plz input interest rate: ");
        double interestRate = sc.nextDouble();
        System.out.print("plz input month: ");
        int month = sc.nextInt();
        sc.close();
        System.out.println(
                "the amount received after " + month + "months is" + deposits * Math.pow((1 + interestRate), month));
    }
}
