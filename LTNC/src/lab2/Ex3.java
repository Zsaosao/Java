package lab2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("plz input a: ");
        float a = sc.nextFloat();
        System.out.print("plz input a: ");
        float b = sc.nextFloat();
        sc.close();
        System.out.println("Solution of the system of equations ax + b = 0 " + (-b / a));

    }
}
