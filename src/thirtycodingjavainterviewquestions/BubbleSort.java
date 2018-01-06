package thirtycodingjavainterviewquestions;

public class BubbleSort {
	public static void main(String[] args) {
		int a[] = { 99, 13, 78, 65, 52, 93, 41, 96, 71, 32 };
		int temp = 0;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[j - 1] > a[j]) {
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
