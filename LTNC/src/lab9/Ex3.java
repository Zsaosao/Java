package lab9;

public class Ex3 {
	public static int indetOf(String text, String textNext) {
		if (text == null || text.equals("")) {
			return -1;
		}
		if (textNext == null) {
			return -1;
		} else if (textNext.equals("")) {
			return 0;
		}
		for (int i = 0; i < text.length(); i++) {
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

	public static void main(String[] args) {
		System.out.println(indetOf("agdga   ga", "gaa"));

	}
}
