package lab7;

public class Ex11 {
	public static int countsTheNumberOfVowels(String text) {
		if (text == null || text.length() == 0) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'u' || text.charAt(i) == 'e' || text.charAt(i) == 'o' || text.charAt(i) == 'a'
					|| text.charAt(i) == 'i') {
				count++;
			}
		}
		return count;
	}
}
