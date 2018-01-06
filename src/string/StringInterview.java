package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringInterview {
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		int digitCount = 0;
		String s = "abcd1234efg";

		String output = "";
		Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher(s);
		while (m.find()) {
			count++;

			sum = sum + Integer.parseInt(m.group());
		}
		int diff = count - String.valueOf(sum).length();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c) && digitCount == 0) {
				output = output + " " + sum;
				for (int j = 0; j < diff - 1; j++) {

					output = output + " ";
				}
				digitCount++;
			}

			if (!Character.isDigit(c)) {
				output = output + c;
			}
		}
		System.out.println(output);
	}
}
