package sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int temp = 0;
		int a[] = { 23, 43, 11, 89, 66, 84, 9 };
		for (int i = 0; i < a.length; i++) {
			int minimum = a[i];
			for (int j = i; j < a.length; j++) {
				if (minimum > a[j]) {
					minimum = a[j];
				}
			}
			for (int k = 0; k < a.length; k++) {
				if (a[k] == minimum) {
					temp = a[i];
					a[i] = minimum;
					a[k] = temp;
					break;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
