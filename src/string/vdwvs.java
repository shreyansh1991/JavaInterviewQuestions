package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class vdwvs {
	public static void main(String[] args) {
		String s = "ghdgw32,cbdshjbcfs7jcndsjcns,jjjf990,kfkkflf";
		String arrays[] = s.split(",");
		for (int i = 0; i < arrays.length; i++) {
			String m = arrays[i];
			Pattern p = Pattern.compile("(?=.*[a-z])(?=.*[0-9])");
			Matcher matcher = p.matcher(m);
			while (matcher.find()) {
				System.out.println(matcher.group() + "   " + matcher.start() + "    " + m);
			}
		}
	}
}
