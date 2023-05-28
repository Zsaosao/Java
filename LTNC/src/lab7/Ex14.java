package lab7;

public class Ex14 {
	public static String deleteAllSpace(String text) {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			if ((int) text.charAt(i) >= 97 && (int) text.charAt(i) <= 122
					|| (int) text.charAt(i) >= 65 && (int) text.charAt(i) <= 90) {
				str.append(text.charAt(i));
			}
		}
		return str.toString();
	}
}
