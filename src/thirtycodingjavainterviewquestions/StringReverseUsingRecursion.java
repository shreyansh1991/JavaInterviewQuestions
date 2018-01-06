package thirtycodingjavainterviewquestions;

import org.omg.Messaging.SyncScopeHelper;

public class StringReverseUsingRecursion {
	static String s="";
	static String rev="";
	public static void main(String[] args) {
	 s = "pak";
	String reverse=	reverse(s.length()-1);
	System.out.println(reverse);
	}
	static String reverse(int length){
		if(length>=0){
			rev=rev+s.charAt(length);
			reverse(length-1);	
		}
		return rev;
	}
}
