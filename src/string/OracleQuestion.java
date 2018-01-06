package string;

public class OracleQuestion {
	public static void main(String[] args) {
		String s = "oracle jpmc";
		String finalString = "";
		String array[] = s.split(" ");
		for (int i = array.length-1; i >= 0; i--) {
			finalString = finalString + array[i] +" ";
		}
		System.out.println(finalString+" ");
	}
}
