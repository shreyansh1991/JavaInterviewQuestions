package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractingNumbers3 {
	public static void main(String[] args) {
		String numbers="";
		String s = "765785687hfghghgh7wnkcjen7427138971#^!@^!";
		String arr[] = s.split("[^\\d]+");
		for (int i = 0; i < arr.length; i++) {
			numbers=numbers+arr[i];
			
		}
		System.out.println(numbers);
	}
}