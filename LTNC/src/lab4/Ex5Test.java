package lab4;

public class Ex5Test {
	public static void main(String[] args) {
		int[] array = { 1, 4, 6, -7, 2, 2, 3, 6, 2, 10, -5, 33 };
		System.out.println("Check if number is in array. Case yes: " + Ex5.checkTheAppearance(2, array));
		System.out.println("Check if number is in array. Case no: " + Ex5.checkTheAppearance(0, array));
		Ex5.numberofTimeSandInPositions(2, array);
		Ex5.deleteElementOfArray(10, array);

		int[] array1 = { 0, 0, 0 };
		System.out.println("Check if number is in array true case: " + Ex5.checkTheAppearance(2, array1));
		System.out.println("Check if number is in array false Case: " + Ex5.checkTheAppearance(0, array1));
		Ex5.numberofTimeSandInPositions(2, array1);
		Ex5.deleteElementOfArray(10, array1);
	}
}
