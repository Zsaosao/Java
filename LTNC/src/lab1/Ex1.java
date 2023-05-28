package lab1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input one integer: ");
        int x = sc.nextInt();
        System.out.print("Please input one floating-pointnumber: ");
        float y = sc.nextFloat();
        System.out.println("Input values are " + x + " and " + y + " their product is " + x * y);
        sc.close();
    }
}
