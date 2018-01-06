package numbersystem;

public class DecimalToBinary {
	public static void main(String[] args) {
		int number = 25;
		int remainder = 0;
		String data = "";
		while (number != 0) {
			remainder = number % 2;
			data = remainder + data;
			number = number / 2;
		}
		System.out.println(data);
	}
}
