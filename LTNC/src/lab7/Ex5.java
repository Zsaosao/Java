package lab7;

public class Ex5 {
	public static boolean isAnagrams(String textFirst, String textSecond) {
		if (textFirst == null || textFirst.length() == 0 || textSecond == null || textSecond.length() == 0
				|| textFirst.length() != textSecond.length()) {
			return false;
		}
		StringBuilder textFirstBuider = new StringBuilder();
		textFirstBuider.append(textFirst);

		for (int i = 0; i < textSecond.length(); i++) {
			int findFirstChar = textFirstBuider.indexOf("" + textSecond.charAt(i));
			if (findFirstChar != -1) {
				textFirstBuider.substring(findFirstChar, findFirstChar + 1);
			} else {
				return false;
			}
		}
		return true;
	}
}
