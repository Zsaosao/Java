package lab5;

public class Ex7 {
	static int pascal(int j, int i) {
		if (j == 0 || j == i) {
			return 1;
		} else {
			return pascal(j - 1, i - 1) + pascal(j, i - 1);
		}
	}

	static void printPascal(int row) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(pascal(j, i) + " ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		printPascal(5);
	}
}
