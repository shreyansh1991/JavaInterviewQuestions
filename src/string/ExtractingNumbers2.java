package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractingNumbers2 {
	public static void main(String[] args) {
		String s = "765785687hfghghgh7wnkcjen7427138971#^!@^!";
		String numbers="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isDigit(c))
			{
				numbers=numbers+c;
			}
		}
		System.out.println(numbers);
	}
}