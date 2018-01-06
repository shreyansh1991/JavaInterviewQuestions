package sorting;

public class QuickSortAlgo {
	public static void main(String[] args) {
		int a[] = { 13, 25, 31, 96, 78, 12, 65, 98, 99 };
		int low = 0;
		int high = a.length - 1;

		sort(a, low, high);
		print(a);
	}

	private static void sort(int a[], int low, int high) {
		if (low < high) {
			int par = partition(a, low, high);
			sort(a, low, par - 1);
			sort(a, par + 1, high);
		}

	}

	public static int partition(int a[], int low, int high) {
		int pivot = a[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (a[j] < pivot) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[i + 1];
		a[i + 1] = a[high];
		a[high] = temp;
		return i + 1;
	}

	static void print(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
