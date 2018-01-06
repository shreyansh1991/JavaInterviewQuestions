package array;

public class SortEvenOdd {
	public static void main(String[] args) {
		int count = 0;

		int[] a = { 1, 2, 4, 2, 1, 3, 4, 5, 6, 5, 4, 3, 77, 85 };
		int b[] = new int[a.length];
		int lastCount = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]  - " + a[i]);

			if ((a[i] % 2) == 0) {
				b[count] = a[i];
				count++;

			} else {
				b[lastCount] = a[i];
				lastCount--;

			}

		}

		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}
	}
}
