package lab4;

public class Ex2 {
	static void countTheLargestNumberThatAppears(int[] array) {
		int indexOfNumberMax = 0;
		int count = 1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == array[indexOfNumberMax]) {
				count++;
			} else if (array[i] > array[indexOfNumberMax]) {
				count = 1;
				indexOfNumberMax = i;
			}
		}
		System.out.println("The largest number is: " + array[indexOfNumberMax] + " and occurs:  " + count + " times");
	}

	public static void main(String[] args) {
		int[] array = { 1, 100, 3, 5, 3, 6, 8, 100, 6, 4, 5, 100, 6, -7, -100, 0 };
		countTheLargestNumberThatAppears(array);
	}
}
