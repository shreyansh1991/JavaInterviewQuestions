import java.util.HashMap;
import java.util.Scanner;

public class SarfarazHomeWork {
	public static void main(String[] args) {
		int count = 0;
		System.out.println("Enter first number");
		Scanner sc = new Scanner(System.in);
		String firstNumber = sc.nextLine();
		System.out.println("Enter second number");
		String secondNumber = sc.nextLine();
		System.out.println("first number :" + firstNumber);
		System.out.println("second number :" + secondNumber);

		int first = Integer.parseInt(firstNumber);
		int second = Integer.parseInt(secondNumber);
		for (int i = first; i <= second; i++) {
			HashMap<Character, Integer> mapValue = new HashMap<Character, Integer>();
			String temp = String.valueOf(i);

			for (int j = 0; j < temp.length(); j++) {

				char c = temp.charAt(j);

				if (!mapValue.containsKey(c)) {
					mapValue.put(c, 1);
				} else {
					mapValue.put(c, mapValue.get(c) + 1);
					count = count + 2;
				}

			}
			if (count > 0) {
				count = 0;
				System.out.println(temp);
			} else {
				count = 0;
				
			}
		}
	}
}
