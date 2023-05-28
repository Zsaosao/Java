package lab4;

public class Ex10 {
	static boolean isThereIsAnElementOnTheMainDiagonalOtherThanZero(int[][] array2D) {
		for (int i = 0; i < array2D.length; i++) {
			if (array2D[i][i] != 0) {
				return true;
			}
		}
		return false;
	}

	static boolean isTriangleMatrix(int[][] array2D) {
		if (!isThereIsAnElementOnTheMainDiagonalOtherThanZero(array2D)) {
			return false;
		}

		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < i; j++) {
				if (array2D[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

	static boolean isSymmetricMatrixThroughMainDiagonal(int[][] array2D) {
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				if (array2D[i][j] != array2D[j][i]) {
					return false;
				}
			}
		}
		return true;
	}

	static boolean isSymmetricMatrixThroughTheCenter(int[][] array2D) {
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				if (array2D[i][j] != array2D[array2D.length - i - 1][array2D.length - j - 1]) {
					return false;
				}
			}
		}
		return true;
	}

}
