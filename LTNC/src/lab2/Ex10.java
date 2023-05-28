package lab2;

import java.util.Scanner;

public class Ex10 {
    static boolean checkLead(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    static int checkDayOfMonth(int month, int year) {
        int nNumOfDays = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                nNumOfDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                nNumOfDays = 30;
                break;
            case 2:
                if (checkLead(year)) {
                    nNumOfDays = 29;
                } else {
                    nNumOfDays = 28;
                }
                break;
        }
        return nNumOfDays;
    }

    static boolean checkAll(int day, int month, int year) {
        if (day <= checkDayOfMonth(month, year) && month <= 12 && year < 9999) {
            return true;
        }
        return false;
    }

    static void nextDay(int day, int month, int year) {
        if (checkAll(day, month, year)) {
            System.out.println("Today: " + day + "/" + month + "/" + year);
            if (day < checkDayOfMonth(month, year)) {
                day++;
            } else {
                if (month < 12) {
                    month++;
                    day = 1;
                } else {
                    year++;
                    day = 1;
                    month = 1;
                }
            }
            System.out.println("The next day of today: " + day + "/" + month + "/" + year);
        } else {
            System.out.println("Invalid date");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("plz input year: ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        sc.close();
        nextDay(day, month, year);
    }
}
