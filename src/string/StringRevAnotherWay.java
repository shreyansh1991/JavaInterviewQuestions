package string;

public class StringRevAnotherWay {
	public static void main(String[] args) {
		String finalOutput = "";
		String temp = "";
		String s = "India is my country ";
		for (int k = 0; k < s.length(); k++) {
			char c = s.charAt(k);
			if (c == ' ') {
				finalOutput = finalOutput + temp + " ";
				temp = "";
			} else {
				temp = c + temp;
			}
		}
		System.out.println(finalOutput);
	}

}