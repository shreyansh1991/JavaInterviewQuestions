package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractingNumbers4 {
	public static void main(String[] args) {
		String numbers = "";
		String s = "765785687hfghghgh7wnkcjen7427138971#^!@^!";
		Pattern p = Pattern.compile("[\\d]+");
		Matcher m = p.matcher(s);
		while (m.find()) {
			numbers = numbers + m.group();

		}
		System.out.println(numbers);
	}
}