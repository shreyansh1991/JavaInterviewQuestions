package thirtycodingjavainterviewquestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersInString {
	public static void main(String[] args) {
		String s = "jisncansjkcna33wqsnfjks732hjsddh71ye";
	/*	boolean b = s.matches("[a-zA-Z0-9]+");
		System.out.println(b);*/
		int count = 0;
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(s);
		while (m.find()) {
			int k = Integer.parseInt(m.group());
			count = count + k;
			// System.out.println(m.start()+" "+m.end()+" "+m.group());

		}
		System.out.println(count);
	}
}