package lab7;

import java.util.ArrayList;

public class Ex17 {
	public static String[] getAllSubstring(String text) {
		text = Ex14.deleteAllSpace(text);
		ArrayList<String> strList = new ArrayList<String>();
		for (int i = 1; i < text.length(); i++) {
			if ((int) text.charAt(i) == 42) {
				break;
			}
			for (int j = 0; j + i <= text.length(); j += 1) {
				strList.add(text.substring(j, j + i));
			}
		}
		return strList.toArray(new String[strList.size()]);
	}
}
