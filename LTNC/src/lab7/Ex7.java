package lab7;

public class Ex7 {
	public static char countSecondMostFrequent(String text) {
		if (text.length() <= 2) {
			return ' ';
		}
		int countFirst = 1;
		int countSecond = 1;
		char second = ' ';

		StringBuilder str = new StringBuilder();
		str.append(text);

		for (int i = 0; i < text.length(); i++) {
			if ((int) text.charAt(i) >= 97 && (int) text.charAt(i) <= 122
					|| (int) text.charAt(i) >= 65 && (int) text.charAt(i) <= 90) {
				int current = 1;
				int count = str.indexOf("" + text.charAt(i), i);
				while (count != -1) {

					count = str.indexOf("" + text.charAt(i), count + 1);
					current++;
				}

				if (current > countFirst) {
					countFirst = current;
				} else if (current > countSecond) {
					second = text.charAt(i);
					countSecond = current;
				}
			}

		}
		return second;
	}
}
