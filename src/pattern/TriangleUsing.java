package pattern;

public class TriangleUsing {
	public static void main(String[] args) {
		int count = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= 1; j--) {
				if (count >= j) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
			count++;
		}
	}
}
