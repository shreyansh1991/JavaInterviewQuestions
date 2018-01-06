package string;

public class RamStringQuestion {
	public static void main(String[] args) {
		String output = "";
		String output1 = "";
		String s = "ram,geetha,sita";
		String arr[] = s.split(",");
		for (int i = 0; i < arr.length; i++) {
			String m = arr[i];
			output = m.substring(0, 1).toUpperCase();

			output = output + m.substring(1, m.length());
			if (arr.length == i + 1) {
				output1 = output1 + output;
			} else {
				output1 = output1 + output + ",";
			}

			output = "";
		}
		System.out.println(output1);
	}
}