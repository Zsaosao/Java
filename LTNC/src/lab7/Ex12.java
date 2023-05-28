package lab7;

public class Ex12 {
	public static String reverseString(String text) {
		if (text == null || text.length() == 0) {
			return " ";
		}
		StringBuilder reverseString = new StringBuilder();
		for (int i = text.length() - 1; i >= 0; i--) {
			reverseString.append(text.charAt(i));
		}
		return reverseString.toString();
	}
}
