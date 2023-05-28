package lab4;

public class Ex7 {
	static boolean isSymmetricalArray(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			if (array[i] != array[array.length - i - 1]) {
				return false;
			}
		}
		return true;
	}

	static boolean isAccentedArray(int[] array) {
		if (array[0] > 0) {
			for (int i = 1; i < array.length; i++) {
				if (i % 2 == 0 && array[i] <= 0) {
					return false;
				} else if (i % 2 != 0 && array[i] >= 0) {
					return false;
				}
			}
		} else {
			for (int i = 1; i < array.length; i++) {
				if (i % 2 == 0 && array[i] >= 0) {
					return false;
				} else if (i % 2 != 0 && array[i] <= 0) {
					return false;
				}
			}
		}
		return true;
	}

}
