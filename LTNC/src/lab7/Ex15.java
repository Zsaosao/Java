package lab7;

public class Ex15 {
	public static String standardizedData(String text) {
		if (text == null || text.equals("")) {
			return "";
		}
		text = " " + text;
		StringBuilder strBuider = new StringBuilder();
		boolean flag = false;
		for (int i = 1; i < text.length(); i++) {
			if (text.charAt(i - 1) == ' ') {
				flag = true;
			}
			if (flag && (int) text.charAt(i) >= 97 && (int) text.charAt(i) <= 122) {
				int currentChar = ((int) text.charAt(i)) - 32;
				strBuider.append(((char) currentChar));
				flag = false;

			} else {
				strBuider.append(text.charAt(i));
				flag = false;
			}
		}
		return strBuider.toString();

	}
}
