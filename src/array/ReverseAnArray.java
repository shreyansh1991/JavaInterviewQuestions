package array;

import org.apache.commons.lang3.ArrayUtils;

public class ReverseAnArray {
	public static void main(String[] args) {
		String value = "";
		int a[] = { 2, 12, 3, 4, 5, 6, 4, 3, 1, 2 };
		ArrayUtils.reverse(a);

		for (int i = a.length - 1; i >= 0; i--) {
			value = value + a[i];
		}
		System.out.println(value);
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt("" + value.charAt(i));

		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}

	}
}
