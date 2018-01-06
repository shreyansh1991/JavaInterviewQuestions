package string;

public class CheckAlphaNumeric {
	public static void main(String[] args) {
		String s = "s1ab,sss,klop,klm9";
		int checkDigit = 0;
		int checkAlphabet = 0;
		String array[] = s.split(",");
		for (int i = 0; i < array.length; i++) {
			String m = array[i];
			for (int j = 0; j < m.length(); j++) {
				char c = m.charAt(j);
				if (Character.isDigit(c) && checkDigit == 0) {
					checkDigit++;
				} else if (Character.isAlphabetic(c) && checkAlphabet == 0) {
					checkAlphabet++;
				}
			}
			if (checkAlphabet > 0 && checkDigit > 0)
				System.out.println(m);
			checkAlphabet = 0;
			checkDigit = 0;
		}
	}
}
