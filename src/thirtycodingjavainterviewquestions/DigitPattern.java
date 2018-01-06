package thirtycodingjavainterviewquestions;

import java.util.Scanner;

public class DigitPattern {
	public static void main(String[] args) {
		int lastDigit = 0;
		int remainder = 0;
		int flag = 0;
		System.out.println("Enter first number");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println("First Number - " + i);
		System.out.println("Enter second number");
		int j = sc.nextInt();
		System.out.println("Second Number - " + j);

		for (int k = i; k <= j; k++) {
			remainder = k % 10;
			int n = k;
			while (n > 0) {
				lastDigit = n % 10;
				n = n / 10;
				if (!(remainder == lastDigit)) {
					flag = 0;
					break;
				} else {
					flag++;
				}
			}
			if (flag > 0) {
				System.out.println(k);
				flag = 0;
			}

		}
	}
}
