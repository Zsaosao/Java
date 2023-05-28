package lab1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("plz input radius");
        int radius = sc.nextInt();
        System.out.println("Perimeter: " + 2 * radius * Math.PI);
        System.out.println("Area: " + radius * radius * Math.PI);
        sc.close();
    }
}
