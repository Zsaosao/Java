package lab5;

public class Ex3 {
	static void swapElementPositionTwoDimensionalArray(int rowOne, int colOne, int rowTwo, int colTwo, int[][] matrix) {
		int temp = matrix[rowOne][colOne];
		matrix[rowOne][colOne] = matrix[rowTwo][colTwo];
		matrix[rowTwo][colTwo] = temp;
	}

	static void swapArrayElementPosition(int index, int indexNext, int[] array) {
		int temp = array[index];
		array[index] = array[indexNext];
		array[indexNext] = temp;
	}

	static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	static void matrixTransposition(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = matrix[i].length - 1; j > i; j--) {
				swapElementPositionTwoDimensionalArray(i, j, j, i, matrix);
			}
		}
	}

	static void swapColumns(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length / 2; j++) {
				swapArrayElementPosition(j, matrix[i].length - 1, matrix[i]);
			}
		}
	}

}
