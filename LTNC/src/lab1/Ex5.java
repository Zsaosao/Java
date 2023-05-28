package lab1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("plz input second: ");
        int second = sc.nextInt();
        int hour = second / 3600;
        int minute = (second - hour * 3600) / 60;
        second = second - hour * 3600 - minute * 60;
        System.out.println(hour + ":" + minute + ":" + second);
        sc.close();
    }
}
