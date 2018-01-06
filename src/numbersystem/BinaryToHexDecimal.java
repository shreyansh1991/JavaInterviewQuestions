package numbersystem;

import java.util.Scanner;

public class BinaryToHexDecimal {
	public static void main(String[] args) {
		System.out.println("Enter binary number");
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		int finalNumber = 0;
		int count = 0;
		for (int i = number.length() - 1; i >= 0; i--) {
			char c = number.charAt(i);
			int n = (int) Math.pow(2, count) * Integer.parseInt("" + c);
			finalNumber = finalNumber + n;
			count++;
		}
		System.out.println(finalNumber);
		char ch[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		int a = 0;
		String result = "";
		while (finalNumber != 0) {
			a = finalNumber % 16;
			result= ch[a] + result;
			finalNumber = finalNumber / 16;
		}
		System.out.println(result);
	}
}
