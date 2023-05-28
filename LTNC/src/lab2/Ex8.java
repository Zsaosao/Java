package lab2;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        String[] can = { "Canh", "Tân", "Nhâm", "Quý", "Giáp", "Ất", "Bính", "Đinh", "Mậu", "Kỷ" };
        String[] chi = { "Thân", "Dậu", "Tuất", "Hợi", "Tý", "Sửu", "Dần", "Mẹo", "Thìn", "Tỵ", "Ngọ", "Mùi" };
        Scanner sc = new Scanner(System.in);
        System.out.print("plz input year of birth: ");
        int year = sc.nextInt();
        sc.close();
        int calculateCan = year % 10;
        int calculateChi = year % 12;
        System.out.println("Your birthyear: " + can[calculateCan] + " " + chi[calculateChi]);
    }
}
