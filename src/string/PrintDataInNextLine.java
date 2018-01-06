package string;

public class PrintDataInNextLine {

	public static void main(String args[]) {
		String s = "aaaaabbbbccccddee";
		String output = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (output.contains("" + c)) {
				output = output + c;
			} else {
				if (output.length() == 0) {
					output = output + c;
				} else {
					System.out.println(output);
					output = "";
					output = output + c;
				}
			}
		}
		System.out.print(output);
	}
}
