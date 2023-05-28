package lab4;

public class Ex6Test {
	public static void main(String[] args) {
		int[] array = { 1, 2, 4, 3, 5, 1, 7, -8 };
		int[] array1 = { -5, -2, 0, 1, 2, 7, 8 };
		Ex4.printArray(array);
		Ex4.printArray(array1);
		System.out.println(
				"Ascending Sequence Of Numbers false case of array : " + Ex6.isAscendingSequenceOfNumbers(array));
		System.out.println(
				"Ascending Sequence Of Numbers true case  of array1: " + Ex6.isAscendingSequenceOfNumbers(array1));
		System.out.println("After sorting array");
		Ex6.SortUpAscending(array);
	}
}
