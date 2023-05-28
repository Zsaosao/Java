package lab4;

public class Ex7Test {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
		int[] array1 = { 1, 2, 3, -6, 4, -5 };
		System.out.println("Check symmetric array true case: " + Ex7.isSymmetricalArray(array));
		System.out.println("Check symmetric array false case: " + Ex7.isSymmetricalArray(array1));

		int[] array2 = { 1, -2, 4, -7, 8, -9, 20 };
		int[] array3 = { 1, 2, 3, -6, 4, -5 };
		System.out.println("Check signed array true case: " + Ex7.isAccentedArray(array2));
		System.out.println("Check signed array false case: " + Ex7.isAccentedArray(array3));
	}
}
