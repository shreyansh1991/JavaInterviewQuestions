package array;

public class SmallestNumber {
	public static void main(String[] args) {
		int a[] = {-9, 2, 12, 3, 4, 5, 6, 4, 3, 1, 2 ,-1};
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println(min);
	}
}
