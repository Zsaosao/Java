package lab7;

public class Ex6 {
	public static String standardizedSpace(String text) {
		if (text == null || text.equals("")) {
			return "";
		}
		StringBuilder strBuider = new StringBuilder();
		strBuider.append(text);
		int firstWord = 0;
		for (int i = 0; i < text.length(); i++) {
			if (!(text.charAt(i) == ' ')) {
				firstWord = i;
				break;
			}
		}
		text = strBuider.substring(firstWord, text.length());
		strBuider.delete(0, strBuider.length());

		strBuider.append(text);
		for (int i = text.length() - 1; i >= 0; i--) {
			if (!(text.charAt(i) == ' ')) {
				firstWord = i;
				break;
			}
		}
		text = strBuider.substring(0, firstWord + 1);
		strBuider.delete(0, strBuider.length());

		for (int i = 0; i < text.length() - 1; i++) {
			if (!(text.charAt(i) == ' ' && text.charAt(i + 1) == ' ')) {
				strBuider.append(text.charAt(i));
			}
		}
		strBuider.append(text.charAt(text.length() - 1));

		return strBuider.toString();

	}

}
