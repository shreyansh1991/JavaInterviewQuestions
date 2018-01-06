package other;

public class OracleQuestiononArray {
	public static void main(String[] args) {
		int a[] = { 88, 2, 1, 6, 4, 2, 9 };
		int b[] = new int[a.length];
		int temp = 0;
		// Sorting the array
		for (int j = 1; j < a.length; j++) {
			for (int i = 1; i < a.length; i++) {
				if (a[i - 1] > a[i]) {
					temp = a[i - 1];
					a[i - 1] = a[i];
					a[i] = temp;
				}
			}
		}
		System.out.println("Sorted Array ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		int count = 0;
		int k = 0;
		// Based on count value even or odd fetch the data from last,start
		// respectively
		for (int i = 0; i < a.length; i++) {

			if (count % 2 == 0) {
				b[i] = a[(a.length - 1) - k];
				k++;
			} else {
				b[i] = a[k - 1];
			}
			++count;

		}
		System.out.println("Required Array");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
