package other;

import java.util.HashMap;

public class Sarfaraz_Encryption2 {
	public static void main(String[] args) {
		String temp = "";
		String s = "w2s3zw3";
		int length = s.length();
		for (int i = 1; i < length; i = i + 2) {
			if (Character.isDigit(s.charAt(i))) {

			} else {
				s = s.substring(0, (i)) + "1" + s.substring(i);

			}

		}
		System.out.println("s - " + s);
		String finalString = "";
		HashMap<Character, String> hmap = new HashMap<Character, String>();
		int count = 0;
		hmap.put('w', "a");
		hmap.put('s', "b");
		hmap.put('z', "c");
		for (int k = 1; k < s.length(); k = k + 2) {
			for (int i = 1; i <= Integer.parseInt("" + s.charAt(k)); i++) {

				finalString = finalString + hmap.get(s.charAt(count));
			}
			count = count + 2;
		}

		System.out.println(finalString);

	}
}