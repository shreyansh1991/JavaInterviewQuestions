package other;

public class StringSwap {
	static void swapTwoStrings(String s1, String s2) {
		System.out.println("Before Swap");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("After Swap");
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println(s1);
		System.out.println(s2);
	}

	public static void main(String[] args) {
		swapTwoStrings("Sea", "Mandya");
		swapTwoStrings("Mississipi", "Mandya");
	}
}