package lab5;

public class Ex6 {
	static int[][] multiplyTwoMatrices(int[][] matrixFirst, int[][] matrixSecond) {
		int[][] matrixResult = new int[matrixFirst.length][matrixFirst[0].length];
		for (int i = 0; i < matrixFirst.length; i++) {
			for (int j = 0; j < matrixFirst.length; j++) {
				int valueCellOfTheMatrix = 0;
				for (int k = 0; k < matrixFirst[i].length; k++) {
					valueCellOfTheMatrix += matrixFirst[i][k] * matrixSecond[k][j];
				}
				matrixResult[i][j] = valueCellOfTheMatrix;
			}

		}
		return matrixResult;
	}

	public static void main(String[] args) {
		int[][] matrixFirst = { { 1, 4, -2 }, { 4, 5, 0 }, { 2, 1, 6 } };
		int[][] matrixSecond = { { 0, 7, 20 }, { -3, 9, 0 }, { 0, 0, -12 } };
		Ex3.printMatrix(matrixFirst);
		System.out.println("-------------------------------");
		Ex3.printMatrix(matrixSecond);
		System.out.println("-------------------------------");
		int[][] matrixResultMultiply = multiplyTwoMatrices(matrixFirst, matrixSecond);
		Ex3.printMatrix(matrixResultMultiply);
	}
}
