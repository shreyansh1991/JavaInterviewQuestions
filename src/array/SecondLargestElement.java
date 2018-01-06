package array;

import java.util.HashMap;

public class SecondLargestElement {
	public static void main(String[] args) {
		int a[] = { 1010, 1005, 94, 123, 456, 1025, 74, 52, 96, 999, 1002, 1007, 1020 };
		int max = a[0];
		int second = 0;
		int j = 0;
		for (int k = 0; k < a.length; k++) {
			if (max < a[k]) {
				second = a[j];
				max = a[k];
				k = j;

			} else if (second < a[k] && max!=a[k]) {
				second = a[k];
			}
			System.out.println("max - " + max + "  " + second);
		}
	}
}
