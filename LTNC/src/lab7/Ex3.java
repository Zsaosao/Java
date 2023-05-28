package lab7;

public class Ex3 {
	public static int[] countVowelsAndconsonant(String text) {
		text = text.toLowerCase();
		char[] vowels = { 'u', 'e', 'o', 'a', 'i' };
		int[] count = { 0, 0 };
		for (int i = 0; i < text.length(); i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (text.charAt(i) == vowels[j]) {
					count[0] += 1;
					break;
				} else if ((int) text.charAt(i) >= 97 && (int) text.charAt(i) <= 122) {
					count[1] += 1;
					break;
				}
			}
		}
		return count;
	}

}
