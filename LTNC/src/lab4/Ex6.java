package lab4;

public class Ex6 {
	static boolean isAscendingSequenceOfNumbers(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}
		}
		return true;
	}

	static void SortUpAscending(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					Ex4.swap(i, j, array);
				}
			}
		}
		Ex4.printArray(array);
	}

}
