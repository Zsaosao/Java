package lab3;

public class Ex7 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.println("Multiplication table for" + i);
            for (int j = 1; j <= 10; j++) {
                int product = i * j;
                System.out.println(i + " x " + j + " = " + product);
            }
        }
    }
}
