package lab5;

public class Ex4 {
	static int[] sumOfRowsOfArray2D(int[][] array2D) {
		int[] result = new int[array2D.length];
		for (int i = 0; i < array2D.length; i++) {
			int rowResult = 0;
			for (int j = 0; j < array2D[i].length; j++) {
				rowResult += array2D[i][j];
			}
			result[i] = rowResult;
		}
		return result;
	}

	static int largestLineArray(int[][] array2D) {
		int[] sumOfEachLine = sumOfRowsOfArray2D(array2D);
		int biggestLine = sumOfEachLine[0];
		for (int i = 1; i < sumOfEachLine.length; i++) {
			if (biggestLine < sumOfEachLine[i]) {
				biggestLine = sumOfEachLine[i];
			}
		}
		return biggestLine;
	}

	public static void main(String[] args) {
		int[][] array2SquareTest = { { 2, -5, 6, 8 }, { 3, 4, -99, 5 }, { 34, 12, 0, 0 }, { -45, 78, -10, 2 } };
		System.out.println("Largest Line Array: " + largestLineArray(array2SquareTest));
	}
}
