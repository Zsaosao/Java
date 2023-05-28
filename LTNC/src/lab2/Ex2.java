package lab2;

import java.util.Scanner;

public class Ex2 {
    static boolean checkLead(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    static int checkDayOfMonth(int month, int year) {
        int day = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 2:
                if (checkLead(year)) {
                    day = 29;
                } else {
                    day = 28;
                }
                break;
        }
        return day;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("plz input year: ");
        int year = sc.nextInt();
        System.out.println("plz input month: ");
        int month = sc.nextInt();
        sc.close();
        System.out.println("Day of month" + month + " is " + checkDayOfMonth(month, year));

    }
}
