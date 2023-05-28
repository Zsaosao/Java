package lab7;

public class Ex10 {
	public static boolean isContainsOnlyDigits(String text) {
		if (text == null || text.length() == 0)
			return false;
		for (int i = 0; i < text.length(); i++) {
			if (!((int) text.charAt(i) >= 48 && (int) text.charAt(i) <= 57)) {
				return false;
			}
		}
		return true;
	}
}
