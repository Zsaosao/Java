package lab5;

public class Ex5Test {
	public static void main(String[] args) {
		int[][] matrixFirst = { { 1, 4, -2 }, { 4, 5, 0 }, { 2, 1, 6 } };
		int[][] matrixSecond = { { 0, 7, 20 }, { -3, 9, 0 }, { 0, 0, -12 } };
		Ex3.printMatrix(matrixFirst);
		System.out.println("-------------------------------");
		Ex3.printMatrix(matrixSecond);
		System.out.println("-------------------------------");
		int[][] matrixResultAdd = Ex5.twoMatricesAddTogether(matrixFirst, matrixSecond);
		int[][] matrixResultSubtract = Ex5.twoMatricesAddTogether(matrixFirst, matrixSecond);
		System.out.println(" Result Add: ");
		Ex3.printMatrix(matrixResultAdd);
		System.out.println("-------------------------------");
		System.out.println(" Result Subtract: ");
		Ex3.printMatrix(matrixResultSubtract);

	}
}
