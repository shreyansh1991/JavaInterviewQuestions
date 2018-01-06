package string;

import java.util.Scanner;

public class StringDemo {
	public static void main(String[] args) {
		String s = "india is my country and i love it";
		System.out.println("enter");
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		String str[] = s.split("\\s");

		/*
		 * // sfinal[]=new int[str.length];
		 */ String sfinal = "";
		int count = 0;
		if (start == 0) {
			for (int i = start; i < str.length; i++) {
				sfinal = sfinal + str[i] + " ";
			}

		} else {
			for (int i = start; i < str.length; i++) {
				sfinal = sfinal + str[i] + " ";
			}
			for (int i = 0; i <= start - 1; i++) {

				sfinal = sfinal + str[i] + " ";
			}
		}

		System.out.println(sfinal);
	}
}
