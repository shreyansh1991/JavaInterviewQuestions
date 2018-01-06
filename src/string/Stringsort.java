package string;

import java.util.Arrays;

public class Stringsort {
	public static void main(String[] args) {
		// char temp=' ';
		String s = "4372847478234";
		char c[] = s.toCharArray();
		// Arrays.sort(c);
		for (int j = 1; j < c.length; j++) {
			for (int i = 1; i < c.length; i++) {
				if (c[i - 1] > c[i]) {
					char temp = c[i - 1];
					c[i - 1] = c[i];
					c[i] = temp;
				}
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

	}
}
