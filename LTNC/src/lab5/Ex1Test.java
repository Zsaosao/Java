package lab5;

public class Ex1Test {
	public static void main(String[] args) {
		int[][] array2D = { { 4, 5, 7, 9 }, { -6, -2, 10, 23 }, { 0 }, { 34 }, { 3, 5 } };
		System.out.println("Array2D Largest Element: " + Ex1.array2DLargestElement(array2D));
		System.out.println("Array2D Smallest Element: " + Ex1.array2DSmallestElement(array2D));
		System.out.println("Sum Of Array2D: " + Ex1.sumOfArray2D(array2D));
	}
}
