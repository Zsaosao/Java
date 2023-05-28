package lab4;

public class Ex4 {
	static void swap(int index, int indexNext, int[] array) {
		int temp = array[index];
		array[index] = array[indexNext];
		array[indexNext] = temp;
	}

	static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
	}

	static void reverseArray(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			swap(i, array.length - i - 1, array);
		}
		printArray(array);
	}

	public static void main(String[] args) {
		int[] array = { 66, 2, 34, 42, 5, 0, 7, 9 };
		reverseArray(array);
		int[] arrayNext = { 66, 2, 34, 42, 5, 0, 7, 9, 0 };
		reverseArray(arrayNext);
	}
}
