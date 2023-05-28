package lab7;

public class Ex16 {
	public static boolean isPalindrome(String text) {
		if (text == null || text.length() == 0) {
			return false;
		}
		for (int i = 0; i < text.length() / 2; i++) {
			if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
