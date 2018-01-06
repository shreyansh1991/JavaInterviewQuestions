package array;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate3 {

	public static void main(String[] args) {
		int count = 0;
		int duplicateCount = 0;
		String check = "";
		String store = "";
		int a[] = { 1, 3, 4, 5, 6, 1, 4 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				int m = a[i];
				if (!check.contains("" + m) && a[i] == a[j] && i != j) {
					count++;
					duplicateCount++;
				}

			}
			if (count > 0) {

				System.out.println(a[i]);
				store = store + a[i];

			} else if (count == 0 && !check.contains("" + a[i])) {
				store = store + a[i];
			}
			check = check + a[i];
			count = 0;

		}
		int newArrayLength = a.length - duplicateCount;
		int b[] = new int[newArrayLength];
		System.out.println(store);
		for (int c = 0; c < store.length(); c++) {
			b[c] = Integer.parseInt("" + store.charAt(c));
		}
		System.out.println("Below are the elements");
		for (int c = 0; c < store.length(); c++) {
			System.out.println(b[c]);
		}

	}
}