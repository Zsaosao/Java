package lab2;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("plz input a: ");
        int a = sc.nextInt();
        System.out.print("plz input b: ");
        int b = sc.nextInt();
        System.out.print("plz input c: ");
        int c = sc.nextInt();
        sc.close();
        if ((a + b) > c && (a + c) > b && (b + c) > a) {

            if (a == b && b == c && a == c) {
                System.out.println("This is an equilateral triangle");
            } else if (a == b || b == c || a == c) {
                if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)
                        || (Math.pow(b, 2) + Math.pow(c, 2)) == Math.pow(a, 2)
                        || (Math.pow(c, 2) + Math.pow(a, 2)) == Math.pow(b, 2)) {
                    System.out.println("This is an isosceles right triangle");
                } else {
                    System.out.println("This is an isosceles triangle");
                }
            } else if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)
                    || (Math.pow(b, 2) + Math.pow(c, 2)) == Math.pow(a, 2)
                    || (Math.pow(c, 2) + Math.pow(a, 2)) == Math.pow(b, 2)) {
                System.out.println("This is a right triangle ");
            }
        } else {
            System.out.println("This is an ordinary triangle");
        }

    }
}
