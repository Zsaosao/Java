package lab7;

public class Ex9 {
	public static int countNumberofWords(String text) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if ((int) text.charAt(i) >= 97 && (int) text.charAt(i) <= 122
					|| (int) text.charAt(i) >= 65 && (int) text.charAt(i) <= 90) {
				count++;

			}
		}
		return count;
	}
}
