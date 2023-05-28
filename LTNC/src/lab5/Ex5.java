package lab5;

public class Ex5 {
	static int[][] twoMatricesAddTogether(int[][] matrixFirst, int[][] matrixSecond) {
		int[][] matrixResult = new int[matrixFirst.length][matrixFirst[0].length];
		for (int i = 0; i < matrixFirst.length; i++) {
			for (int j = 0; j < matrixFirst.length; j++) {
				matrixResult[i][j] = matrixFirst[i][j] + matrixSecond[i][j];
			}
		}
		return matrixResult;
	}

	static int[][] twoMatricesSubtractTogether(int[][] matrixFirst, int[][] matrixSecond) {
		int[][] matrixResult = new int[matrixFirst.length][matrixFirst[0].length];
		for (int i = 0; i < matrixFirst.length; i++) {
			for (int j = 0; j < matrixFirst.length; j++) {
				matrixResult[i][j] = matrixFirst[i][j] - matrixSecond[i][j];
			}
		}
		return matrixResult;
	}
}
