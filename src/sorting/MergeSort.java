package sorting;

public class MergeSort {
	static int arr[] = { 23, 43, 11, 89, 66, 84, 9 };

	public static void main(String[] args) {

		System.out.println("Given Array");
		printArray(arr);
		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);
		System.out.println("\nSorted array");
		printArray(arr);
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	void sort(int arr[], int l, int r) {
		System.out.println(l + "  :  " +" r - " +r);
		if (l < r) {
			// Find the middle point
			int m = (l + r) / 2;

			// Sort first and second halves
			sort(arr, l, m);
			// System.out.println("r - "+r);
			sort(arr, m + 1, r);

			// Merge the sorted halves
			System.out.println(" l - " + l + " m - " + m + " r - " + r);
			merge(arr, l, m, r);
		} else {
			System.out.println("else");
		}
	}

	void merge(int arr[], int l, int m, int r) {
		System.out.println("finally!!!!!!!!!!!");
		System.out.println(" l - " + l + " m - " + m + " r - " + r);
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;
System.out.println("n1 - "+n1 +"n2 -"+n2);
		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
		System.out.println("   k  - "+k + " i - "+i +"  j- "+j);
	}

}