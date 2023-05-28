package lab2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Plz input the number one: ");
        float numberOne = sc.nextFloat();
        System.out.print("Plz input the number two: ");
        float numberTwo = sc.nextFloat();
        if (numberOne > numberTwo) {
            System.out.println("The largest of the two numbers is " + numberOne);
        } else {
            System.out.println("The largest of the two numbers is " + numberTwo);
        }
        sc.close();
    }
}
