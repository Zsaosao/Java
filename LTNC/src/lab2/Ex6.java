package lab2;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("plz input a: ");
        int a = sc.nextInt();
        System.out.print("plz input b: ");
        int b = sc.nextInt();
        System.out.print("plz input c: ");
        int c = sc.nextInt();
        sc.close();
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("perimeter of triangle: " + (a + b + c));
            float halfCircumference = (float) (a + b + c) / 2;

            System.out.println("Area of triangle: " + (Math.sqrt(halfCircumference * (halfCircumference - a)
                    * (halfCircumference - b) * (halfCircumference - c))));
            System.out.println(Math.toDegrees(Math.acos((float) (b * b + c * c - a * a) / (2 * b * c))));
            System.out.println(Math.toDegrees(Math.acos((float) (a * a + c * c - b * b) / (2 * a * c))));
            System.out.println(Math.toDegrees(Math.acos((float) (b * b + a * a - c * c) / (2 * b * a))));
        } else {
            System.out.println("This is not triangle");
        }
    }
}