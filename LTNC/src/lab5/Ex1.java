package lab5;

public class Ex1 {
	static int array2DLargestElement(int[][] array2D) {
		int largestElement = array2D[0][0];
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				if (array2D[i][j] > largestElement) {
					largestElement = array2D[i][j];
				}
			}
		}
		return largestElement;
	}

	static int array2DSmallestElement(int[][] array2D) {
		int smallestElement = array2D[0][0];
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				if (array2D[i][j] < smallestElement) {
					smallestElement = array2D[i][j];
				}
			}
		}
		return smallestElement;
	}

	static int sumOfArray2D(int[][] array2D) {
		int total = 0;
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				total += array2D[i][j];
			}
		}
		return total;
	}
}
