package lab1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("y = 4(x-3) + 20");
        System.out.print("input x: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Anwser " + 4 * (x - 3) + 20);
        sc.close();
    }
}
