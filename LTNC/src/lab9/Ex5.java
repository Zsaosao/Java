package lab9;

public class Ex5 {
	public static String hashForward3Ascii(String text) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			int currentChar = (int) text.charAt(i);
			if (currentChar >= 48 && currentChar <= 57 || currentChar >= 65 && currentChar <= 90
					|| currentChar >= 97 && currentChar <= 122) {
				stringBuilder.append((char) (currentChar + 3));
			} else {
				stringBuilder.append((char) (currentChar));
			}
		}
		return stringBuilder.toString();
	}

	public static void main(String[] args) {
		System.out.println(hashForward3Ascii("Nguyen huy vu 444"));
	}
}
