package lab5;

public class Ex3Test {
	public static void main(String[] args) {
		int[][] matrix = { { 2, 4, -7 }, { 3, 7, 0 }, { 2, -10, 10 } };
		Ex3.printMatrix(matrix);
		System.out.println("-------------------------------------");
		Ex3.matrixTransposition(matrix);
		Ex3.printMatrix(matrix);
		System.out.println("-------------------------------------");
		Ex3.swapColumns(matrix);
		Ex3.printMatrix(matrix);
	}
}
