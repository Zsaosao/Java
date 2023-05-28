package lab2;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Plz input number  ");
        int number = sc.nextInt();
        sc.close();
        ArrayList<Integer> myList = new ArrayList<>();
        String[] value = { "", "mươi", "trăm" };
        String[] numberToText = { "không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười" };
        if (number <= 10) {
            System.out.println(numberToText[number]);
        } else {
            while (number > 0) {
                int dividend = number % 10;
                myList.add(0, dividend);
                number /= 10;
            }
            for (int i = 0; i < myList.size(); i++) {
                System.out.print(numberToText[myList.get(i)] + " " + value[myList.size() - 1 - i] + " ");
            }
        }
    }
}
