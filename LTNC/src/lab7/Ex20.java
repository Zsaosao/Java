package lab7;

public class Ex20 {
	public static String removesAllTheSpecialCharacters(String text) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			if ((int) text.charAt(i) >= 97 && (int) text.charAt(i) <= 122
					|| (int) text.charAt(i) >= 65 && (int) text.charAt(i) <= 90 || (int) text.charAt(i) == 32
					|| (int) text.charAt(i) >= 48 && (int) text.charAt(i) <= 57) {
				stringBuilder.append(text.charAt(i));
			}

		}
		return stringBuilder.toString();
	}
	// max array

}
