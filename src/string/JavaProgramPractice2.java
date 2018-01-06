package string;

import java.util.HashMap;

public class JavaProgramPractice2 {
	public static void main(String[] args) {
		String s = "This is a string";
		String subString = "is a";
		int count = 0;
		int k = 0;

		String splittedString[] = s.split(" ");
		String splittedSubString[] = subString.split(" ");
		for (int i = 0; i < splittedString.length; i++) {
			if (splittedString[i].equals(splittedSubString[k])) {
				k++;
				count++;
				if (k == splittedSubString.length && k == count) {
					System.out.println("Yes");
					break;
				}

			} else {
				count = 0;
			}
		}
	}

}
