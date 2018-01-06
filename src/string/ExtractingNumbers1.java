package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractingNumbers1 {
	public static void main(String[] args) {
		String s = "765785687hfghghgh7wnkcjen7427138971#^!@^!";
		s=s.replaceAll("[^\\d+]", "");
		System.out.println(s);
	}
}