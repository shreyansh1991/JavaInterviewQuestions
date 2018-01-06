package string;

public class Triangle {
	public static void main(String[] args) {
		int i = 1;
		for (int k = 1; k < 10; k = k + 2) {
			for (i = k; i < 9; i = i + 2) {
				System.out.print(" ");
			}
			for (int j = 0; j < k; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
