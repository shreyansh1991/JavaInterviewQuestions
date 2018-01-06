package thirtycodingjavainterviewquestions;

public class IndexOfParticularString {
	public static void main(String[] args) {
		String s = "cat";
		String str = "cbsdjbcjadsbcatchjsbchjcatbashjbchjab";
		int lastIndex = 0;
		lastIndex = str.indexOf(s);
		while (lastIndex != -1) {
			System.out.println(lastIndex);
			lastIndex = str.indexOf(s, lastIndex + 1);
		}
	}
}
