package lab9;

public class Ex6 {
	public static String hashPlusKMinusL(String text, int k, int l) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			int currentChar = (int) text.charAt(i);
			if (currentChar >= 48 && currentChar <= 57 || currentChar >= 65 && currentChar <= 90
					|| currentChar >= 97 && currentChar <= 122) {
				if (i % 2 == 0) {
					stringBuilder.append((char) (currentChar + k));
				} else {
					stringBuilder.append((char) (currentChar - l));
				}
				stringBuilder.append(" ");
			} else if (currentChar == 32) {

			} else {
				stringBuilder.append((char) (currentChar));
			}
		}
		return stringBuilder.toString();
	}

	public static void main(String[] args) {
		System.out.println(hashPlusKMinusL("Nguyen huy vu 444", 4, 5));
	}
}
