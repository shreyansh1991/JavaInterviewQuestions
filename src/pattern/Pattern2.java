package pattern;

import java.util.Scanner;
// Triangle Pattern
public class Pattern2 {
	public static void main(String[] args) {
		int count = 1;
		int i, k = 1;

		System.out.println("Enter no");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int number = Integer.parseInt(s);
		for (int m = 1; m <= number; m++) {
			for (i = number; i >= 1; i--) {
				if (count >= i) {
					for (k = 1; k <= 2 * count - 1; k++) {
						System.out.print("*");
						
					}
					break;
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
			count = count + 1;
		}
	}
}
