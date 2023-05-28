package lab4;

public class Ex1 {
	static void positionandValueofTheLargest(int[] array) {
		int indexMax = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[indexMax]) {
				indexMax = i;
			}
		}
		System.out.println("The largest number is: " + array[indexMax] + " and its position is: " + indexMax);
	}

	static void positionandValueofTheSmallest(int[] array) {
		int indexMax = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[indexMax]) {
				indexMax = i;
			}
		}
		System.out.println("The smallest number is: " + array[indexMax] + " and its position is: " + indexMax);
	}

	static void totalValueOfArray(int[] array) {
		int sum = 0;
		for (int i = 1; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("Total value of array: " + sum);
	}

}
