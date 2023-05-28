package lab4;

import java.util.Scanner;

public class Ex3 {
	static int[] inputArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements of the array: ");
		int lengthArray = sc.nextInt();
		int[] array = new int[lengthArray];
		for (int i = 0; i < lengthArray; i++) {
			System.out.print("Enter element position " + i + " ");
			array[i] = sc.nextInt();
		}
		sc.close();
		return array;
	}

	static int countingNegativeNumbers(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				count += 1;
			}
		}
		return count;
	}

	static int countingPositiveNumbers(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				count += 1;
			}
		}
		return count;
	}

	static int countingZeros(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				count += 1;
			}
		}
		return count;
	}

	static int findTheFirstNegative(int[] array) {
		int largestNegative = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				largestNegative = array[i];
				break;
			}
		}
		return largestNegative;
	}

	static Integer findTheLargestNegativeNumber(int[] array) {
		int largestNegative = findTheFirstNegative(array);
		if (largestNegative == 0) {
			return null;
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largestNegative && array[i] < 0) {
				largestNegative = array[i];
			}
		}
		return largestNegative;
	}

	static int findThePositiveNegative(int[] array) {
		int smallNegative = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				smallNegative = array[i];
				break;
			}
		}
		return smallNegative;
	}

	static Integer findTheLargestPositiveNumber(int[] array) {
		int smallNegative = findThePositiveNegative(array);
		if (smallNegative == 0) {
			return null;
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] < smallNegative && array[i] > 0) {
				smallNegative = array[i];
			}
		}
		return smallNegative;
	}

	static int negativeTotal(int[] array) {
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				total += array[i];
			}
		}
		return total;
	}

	static int positiveTotal(int[] array) {
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				total += array[i];
			}
		}
		return total;
	}

	static boolean checkPositiveSumEqualNegativeSum(int[] array) {
		return positiveTotal(array) == negativeTotal(array);
	}

}
