package lab7;

public class Ex4 {
	public static char findFirstChar(String text) {
		for (int i = 0; i < text.length(); i++) {
			if ((int) text.charAt(i) >= 97 && (int) text.charAt(i) <= 122
					|| (int) text.charAt(i) >= 65 && (int) text.charAt(i) <= 90) {
				return text.charAt(i);
			}
		}
		return ' ';
	}

	public static char findlargestWord(String text) {
		char resuld = findFirstChar(text);
		if (resuld == ' ') {
			return ' ';
		}
		for (int i = 0; i < text.length(); i++) {
			if ((int) text.charAt(i) >= 97 && (int) text.charAt(i) <= 122
					|| (int) text.charAt(i) >= 65 && (int) text.charAt(i) <= 90) {
				if ((int) text.charAt(i) > (int) resuld) {
					resuld = text.charAt(i);
				}
			}
		}
		return resuld;

	}
}
