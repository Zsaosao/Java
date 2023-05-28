package lab3;

public class Ex3 {
    public static void main(String[] args) {
        int father = 35;
        int son = 4;
        int countYear = 0;
        for (int i = 0;; i++) {
            if ((float) son / father == 0.5) {
                countYear = i;
                break;
            }
            father++;
            son++;
        }
        System.out.println("son is 1/2 the father's age after " + countYear + " years");
    }
}
