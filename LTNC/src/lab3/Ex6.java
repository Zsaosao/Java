package lab3;

public class Ex6 {
    public static void main(String[] args) {
        for (int i = 0; i <= 90; i += 5) {
            double radians = Math.toRadians(i);
            System.out.print("Angle: " + i + " ");
            System.out.print("Sin: " + Math.sin(radians) + " ");
            System.out.print("Cos: " + Math.cos(radians) + " ");
            System.out.print("Tan: " + Math.tan(radians) + " ");
            System.out.println("Cotang: " + 1.0 / Math.tan(radians));
        }
    }
}
