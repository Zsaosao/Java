package lab9;

public class Ex4 {
	public static int indetOf(String text, String textNext, int start) {
		if (text == null || text.equals("")) {
			return -1;
		}
		if (textNext == null) {
			return -1;
		} else if (textNext.equals("")) {
			return 0;
		}
		for (int i = start; i < text.length(); i++) {
			if (text.charAt(i) == textNext.charAt(0)) {
				boolean flag = true;
				for (int j = 0; j < textNext.length(); j++) {
					if (i + j > text.length() - 1) {
						return -1;
					}
					if (!(text.charAt(i + j) == textNext.charAt(j))) {
						flag = false;
						break;
					}
				}
				if (flag) {
					return i;
				}
			}
		}
		return -1;
	}

	public static String replaceAll(String mainLetter, String replacedLetters, String alternativeLetters) {
		int n = -1;
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(mainLetter);
		while (true) {
			n = indetOf(stringBuilder.toString(), replacedLetters, n + 1);
			if (n != -1) {
				stringBuilder.delete(n, n + replacedLetters.length());
				stringBuilder.insert(n, alternativeLetters);
			} else {
				break;
			}
		}
		return stringBuilder.toString();
	};

	public static void main(String[] args) {
		System.out.println(replaceAll("huy vuuu", "uu", "kaka"));
	}
}
