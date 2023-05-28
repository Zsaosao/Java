package lab9;

public class Ex1 {
	public static int countWordinText(String text) {
		if (text == null || text.equals("")) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (!(text.charAt(i) == ' ')) {
				count++;
			}
		}
		return count;
	}

	public static String printAWordOneLine(String text) {
		if (text == null || text.equals("")) {
			return "";
		}
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			if (!(text.charAt(i) == ' ')) {
				stringBuilder.append(text.charAt(i) + "\n");
			}
		}
		return stringBuilder.toString();

	}

	public static String reverseString(String text) {
		if (text == null || text.equals("")) {
			return "";
		}
		StringBuilder strBuider = new StringBuilder();
		for (int i = text.length() - 1; i >= 0; i--) {
			strBuider.append(text.charAt(i));
		}
		return strBuider.toString();

	}

	public static void main(String[] args) {
		// System.out.println(countWordinText(" vu nguyeen 232 "));
		System.out.println(printAWordOneLine("      vu      nguyeen 232   "));
		// System.out.println(reverseString(" vu nguyeen 232 "));
	}
}
