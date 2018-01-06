package string;

import java.util.Scanner;

public class ReplaceAllDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String inputString = sc.nextLine();
		System.out.println("Enter word to be replaced from:");
		String from = sc.nextLine();
		System.out.println("Enter word to replaced to:");
		String to = sc.nextLine();
		System.out.println("Input string: " + inputString);
		System.out.println("Word to be replaced from: " + from);
		System.out.println("Word to be replaced to: " + to);

		inputString = inputString.replaceAll(from, to);
		System.out.println(inputString);
	}
}
