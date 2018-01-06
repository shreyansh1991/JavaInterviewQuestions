package string;

//wap takes a string ,print each character which is in odd place and remove each character of even place
public class OddEven {
	public static void main(String[] args) {
		String s = "Shreyansh";
		String output = "";
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 != 0) {
				char c = s.charAt(i);
				output = output + c;

			}

		}
		System.out.println(output);
	}
}
