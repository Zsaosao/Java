package lab2;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        System.out.println("intersection part: " + Math.max(0, Math.min(b1, b2) - Math.max(a1, a2)));
        System.out.println("compatible part: " + (Math.max(b1, b2) - Math.min(a1, a2)));
        sc.close();
    }

}