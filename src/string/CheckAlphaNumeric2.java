package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckAlphaNumeric2 {
	public static void main(String[] args) {
		String s = "#%%9,5a,klop,9klm9";
		String array[] = s.split(",");
		for (int j = 0; j < array.length; j++) {
			String m = array[j];
			Pattern p = Pattern.compile("(?=.*[a-zA-Z])(?=.*[0-9])");
		
			Matcher x = p.matcher(m);
			while (x.find()) {
				System.out.println(m);
				break;
			}

		}
	}
	// .* therefore means an arbitrary string of arbitrary length.
	/*
	 * explanation of regex used
	 * 
	 * 
	 * 
	 * 
	 * ^ start of line (?= ) positive look ahead .*[a-zA-Z] any chars followed
	 * by alphabets (?= ) another positive look ahead .*[0-9] any chars followed
	 * by digits [a-zA-Z0-9]+ alphanumeric characters $ till end of line
	 */
}
