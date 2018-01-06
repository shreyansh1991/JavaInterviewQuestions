package pattern;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		int i, k;
		int count = 1;
		System.out.println("Enter no");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int number = Integer.parseInt(s);
		for (int m = 1; m <= number; m++) {
			for (i = number; i >= 1; i--) {
				if (count >= i) {
					System.out.print(i);
				} else {
					System.out.print(" ");
				}
			}
			for (k = 2; k <= count; k++) {
				System.out.print(k);
			}
			System.out.println();
			count = count + 1;
		}
	}
}
