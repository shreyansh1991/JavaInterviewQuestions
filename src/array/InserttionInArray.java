package array;

public class InserttionInArray {
	public static void main(String[] args) {
		int a[] = { 12, 45, 96, 71, 22, 36, 56 };
		int b[] = new int[a.length + 1];
		for (int i = a.length - 1; i >= 2; i--) {
			b[i + 1] = a[i];
		}
		for (int i = 0; i < 2; i++) {
			b[i] = a[i];
		}
		b[2] = 99;
		for (int i = 0; i < b.length; i++)
			System.out.println(b[i]);
	}
}
