package string;

import java.util.HashMap;

public class StringDemo1 {
	public static void main(String[] args) {
		String s = "This is a string";
		String subString = "is a";
		int count = 0;
		String splittedString[] = s.split(" ");
		HashMap map = new HashMap();
		for (int i = 0; i < splittedString.length; i++) {
			map.put(splittedString[i], 1);
		}
		String splittedSubString[] = subString.split(" ");
		for (int i = 0; i < splittedSubString.length; i++) {
			if (!map.containsKey(splittedSubString[i])) {
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("Yes");
		}else
		{
			System.out.println("No");
		}
	}
}
