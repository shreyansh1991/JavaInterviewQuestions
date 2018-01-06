package string;

public class StringRev {
	public static void main(String[] args) {
		String s = "India is my country";
		String arr[] = s.split(" ");
		String finalOutput = "";
		String temp = "";
		for (int i = 0; i < arr.length; i++) {
			String s1 = arr[i];
			for (int j = 0; j < s1.length(); j++) {
				temp = s1.charAt(j) + temp;
			}
			finalOutput = finalOutput + temp + " ";
			temp = "";
		}
		System.out.println(finalOutput);

	}
}

