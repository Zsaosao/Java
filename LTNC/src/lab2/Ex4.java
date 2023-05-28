package lab2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the coefficient of order 2, a = ");
        float a = sc.nextFloat();
        System.out.print("enter the coefficient of order 1, b = ");
        float b = sc.nextFloat();
        System.out.print(" Enter the free constant, c = ");
        float c = sc.nextFloat();
        sc.close();
        if (a == 0) {
            if (b == 0) {
                System.out.println("The equation has no solution");
                if (c == 0) {
                    System.out.println("Equation with infinite solutions");
                }
            } else {
                System.out.println("The equation has 1 solutions " + "x = " + (-c / b));
            }
        } else {
            float delta = b * b - 4 * a * c;
            float x1;
            float x2;
            if (delta > 0) {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("The equation has 2 solutions: " + "x1 = " + x1 + " và x2 = " + x2);
            } else if (delta == 0) {
                x1 = (-b / (2 * a));
                System.out.println("Equation with double solutions: " + "x1 = x2 = " + x1);
            } else {
                System.out.println("The equation has no solution");
            }
        }

    }

}
