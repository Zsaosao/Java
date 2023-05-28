package lab9;

public class Ex2 {
	public static String toUperCase(String text) {
		if (text == null || text.equals("")) {
			return "";
		}
		StringBuilder strBuider = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			if ((int) text.charAt(i) >= 97 && (int) text.charAt(i) <= 122 || (int) text.charAt(i) == 32) {
				int currentChar = ((int) text.charAt(i)) - 32;
				strBuider.append(((char) currentChar));

			} else if ((int) text.charAt(i) >= 65 && (int) text.charAt(i) <= 90
					|| (int) text.charAt(i) >= 48 && (int) text.charAt(i) <= 57) {
				strBuider.append(text.charAt(i));
			}
		}
		return strBuider.toString();
	}

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

			} else if (flag && (int) text.charAt(i) >= 65 && (int) text.charAt(i) <= 90) {
				strBuider.append(text.charAt(i));
				flag = false;

			} else {
				strBuider.append(text.charAt(i));
				flag = false;
			}
		}
		return strBuider.toString();

	}

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
		text = strBuider.substring(firstWord, text.length() - 1);
		strBuider.delete(0, strBuider.length());

		strBuider.append(text);
		for (int i = text.length() - 1; i > 0; i--) {
			if (!(text.charAt(i) == ' ')) {
				firstWord = i;
				break;
			}
		}
		text = strBuider.substring(0, firstWord);
		strBuider.delete(0, strBuider.length());

		for (int i = 0; i < text.length(); i++) {
			if (!(text.charAt(i) == ' ' && text.charAt(i + 1) == ' ')) {
				strBuider.append(text.charAt(i));
			}
		}
		strBuider.append(text.charAt(text.length() - 1));

		return strBuider.toString();

	}

	public static void main(String[] args) {
		System.out.println(toUperCase("      vu      nguyeenNNN Ka 232   "));
		System.out.println(standardizedData("      vu      nguyeenNNN Ka 232   "));
		System.out.println(standardizedSpace("      vu      nguyeenNNN Ka 2   4423434@@@32aa aaa        "));
	}

}
