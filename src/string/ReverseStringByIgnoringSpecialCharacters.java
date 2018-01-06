package string;

import java.util.HashMap;

public class ReverseStringByIgnoringSpecialCharacters {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap();
		String s = "Shreyansh@JAIN";

		String finalString = "";
		int counter = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '@') {
				int index = s.indexOf("@", i);
				System.out.println(index);
				map.put(counter, index + "@");
				counter++;
			}
		}
		// System.out.println(map);
		s = s.replaceAll("[\\W+]", "");
		int checkingCounter = 0;
		int m = -1;
		for (int i = s.length() - 1; i >= 0; i--) {
			m++;
			System.out.println("m - "+m);
			if (map.size() > checkingCounter) {

				String value = map.get(checkingCounter);
				int temp = Integer.parseInt(value.replaceAll("[\\D+]", ""));

				System.out.println("temp - " + temp);
				if (m == temp) {
					System.out.println("m - " + m);
					System.out.println("checkingCounter - " + checkingCounter);
					value = value.replaceAll("[\\d+]", "");
					// System.out.println("do");
					// System.out.println(value);
					finalString = finalString + value;
					// System.out.println(finalString);
					m++;
					checkingCounter++;
				}
			}

			finalString = finalString + s.charAt(i);

		}
		System.out.println(finalString);
	}
}
