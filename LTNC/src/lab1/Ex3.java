package lab1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("plz input mile: ");
        int mile = sc.nextInt();
        System.out.println("convert from mile to km " + mile + " mile" + " = " + mile * 1609 + "km");
        sc.close();
    }
}
