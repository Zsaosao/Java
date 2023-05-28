package lab4;

public class Ex10Test {
	public static void main(String[] args) {
		int[][] array2DOne = { { 1, 2, 3, 4 }, { 0, 4, 5, 6 }, { 0, 0, -5, -7 }, { 0, 0, 0, 9 } };
		System.out.println("Check triangle Matrix true case: " + Ex10.isTriangleMatrix(array2DOne));
		int[][] array2DTwo = { { 1, 2, 3, 4 }, { 0, 4, 5, 6 }, { 0, 0, -5, -7 }, { 0, 0, 0, 0 } };
		System.out.println("Check triangle Matrix true case: " + Ex10.isTriangleMatrix(array2DTwo));
		int[][] array2DThree = { { 1, 2, 3, 4 }, { 0, 0, 5, 6 }, { -60, 50, 0, -7 }, { 0, 0, 0, 0 } };
		System.out.println("Check triangle Matrix false case: " + Ex10.isTriangleMatrix(array2DThree));

		int[][] array2DFour = { { 1, 2, 3 }, { 2, 4, 5 }, { 3, 5, 6 } };
		System.out.println("Check Symmetric Matrix Through Main Diagonal true case: "
				+ Ex10.isSymmetricMatrixThroughMainDiagonal(array2DFour));
		int[][] array2DFive = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 8, 6, 6, 5 }, { 4, 3, 2, 1 } };
		System.out.println("Check Symmetric Matrix Through Main Diagonal false case: "
				+ Ex10.isSymmetricMatrixThroughMainDiagonal(array2DFive));

		int[][] array2DSix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 8, 7, 6, 5 }, { 4, 3, 2, 1 } };
		System.out.println("Check Symmetric Matrix Through Rhe Center true case: "
				+ Ex10.isSymmetricMatrixThroughTheCenter(array2DSix));
		System.out.println("Check Symmetric Matrix Through Rhe Center false case: "
				+ Ex10.isSymmetricMatrixThroughTheCenter(array2DFive));
	}

}
