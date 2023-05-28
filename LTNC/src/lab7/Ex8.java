package lab7;

public class Ex8 {
	public static int findFirstCharReturnInt(String text) {
		for (int i = 0; i < text.length(); i++) {
			if ((int) text.charAt(i) >= 97 && (int) text.charAt(i) <= 122
					|| (int) text.charAt(i) >= 65 && (int) text.charAt(i) <= 90) {
				return i;
			}
		}
		return -1;
	}

	public static int findLastCharReturnInt(String text) {
		for (int i = text.length() - 1; i > 0; i--) {
			if ((int) text.charAt(i) >= 97 && (int) text.charAt(i) <= 122
					|| (int) text.charAt(i) >= 65 && (int) text.charAt(i) <= 90) {
				return i;
			}
		}
		return -1;
	}

	public static String removeFirstAndLastCharacter(String text) {
		StringBuilder strBuider = new StringBuilder();
		strBuider.append(text);
		int findFirstChar = findFirstCharReturnInt(strBuider.toString());
		strBuider.delete(findFirstChar, findFirstChar + 1);

		int lastFirstChar = findLastCharReturnInt(strBuider.toString());
		strBuider.delete(lastFirstChar, lastFirstChar + 1);
		return strBuider.toString();
	}
}
