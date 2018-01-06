package other;

public class GivenCharacterCountWithOutUsingAnyLoop {
	public static void main(String[] args) {
		String s = "shreyanshismyfriend";
		String s1 = s.toLowerCase();
		int m = s1.length() - s1.replace("s", "").length();
		System.out.println(m);
	}
}
