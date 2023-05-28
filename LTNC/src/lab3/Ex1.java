package lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Plz input number: ");
            int valueInput = sc.nextInt();
            list.add(valueInput);
            if (valueInput == 0) {
                break;
            }
        }
        sc.close();
        int sum = 0;
        int biggestNumber = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            if (biggestNumber < list.get(i)) {
                biggestNumber = list.get(i);
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum / list.size());
        System.out.println("biggest number: " + biggestNumber);
    }
}
