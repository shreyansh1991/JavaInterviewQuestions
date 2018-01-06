package other;

import java.util.HashMap;

public class Sarfaraz_Encryption {
	public static void main(String[] args) {
		String s = "w2s3zw3";
		String finalString = "";
		int length = s.length();
		for (int i = 1; i < length; i = i + 2) {
			if (Character.isDigit(s.charAt(i))) {

			} else {
				s = s.substring(0, (i)) + "1" + s.substring(i);

			}

		}
		System.out.println("s - " + s);
		HashMap<Character, String> hmap = new HashMap<Character, String>();
		int count = 0;
		hmap.put('w', "a");
		hmap.put('s', "b");
		hmap.put('z', "c");
		String splittedString[] = s.split("\\D");
		System.out.println(splittedString.length);
		for (int k = 0; k < splittedString.length; k++) {
			if (splittedString[k].equals("")) {
				continue;
			}
			for (int j = 1; j <= Integer.parseInt(splittedString[k]); j++) {

				finalString = finalString + hmap.get(s.charAt(count));
			}
			count = count + 2;
		}
		System.out.println(finalString);

	}
}
