package numbersystem;

public class BinaryToDecimal {
	public static void main(String[] args) {
		int num = 1010;
		int d = 0;
		int total = 0;
		int count = 0;
		String s = String.valueOf(num);
		for (int i = s.length() - 1; i >= 0; i--) {
			d = (int) (Math.pow(2, count) * Integer.parseInt("" + s.charAt(i)));
			total = total + d;
			count++;
		}
		System.out.println(total);
	}
}
