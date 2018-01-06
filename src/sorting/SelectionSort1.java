package sorting;

public class SelectionSort1 {
	public static void main(String[] args) {
		int temp, index = 0;
		int a[] = { 23, 43, 11, 89, 66, 84, 9 };
		for (int i = 0; i < a.length; i++) {
			int minimum = a[i];
			for (int j = i; j < a.length; j++) {
				if (minimum > a[j]) {
					minimum = a[j];
					index = j; // finding the j index minimum element of array
				}
			}
			temp = a[i];
			a[i] = minimum;
			a[index] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
	}
}
