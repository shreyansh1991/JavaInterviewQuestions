package string;

public class PatternMatching {
	public static void main(String[] args) {
		String s = "naveenreddynaveenreddygjhghjvhhghgvghvhgvred";
		int count = 0;
		String tocheck = "red";
		
		int v=s.indexOf(tocheck);
		
		
		while (v != -1) {
			count++;
			v = s.indexOf(tocheck, v+1);
		}

		System.out.println(count);
	}
}
