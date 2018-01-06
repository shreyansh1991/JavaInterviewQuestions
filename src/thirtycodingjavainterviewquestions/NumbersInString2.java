package thirtycodingjavainterviewquestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

public class NumbersInString2 {
	public static void main(String[] args) {
		int count = 0;
		String s = "7878jisncansjkcna33wqsnfjks732hjsddh71";
		// 2ways to split the string we can use any one.
		//String str[] = s.split("[^\\d]+");
		String str[] = s.split("[a-zA-Z]+");
		for (int i = 0; i < str.length; i++) {
			count = count + Integer.parseInt(str[i]);
		}
		System.out.println(str[0] + " : " + count);

	}
}
