package thirtycodingjavainterviewquestions;

public class StringReverse {
public static void main(String[] args) {
	String reverseString="";
	String s="shreyansh";
	for(int j=s.length()-1;j>=0;j--)
	{
		char c=s.charAt(j);
		reverseString=reverseString+c;
	}
	System.out.println("Reverse String for "+s+ " is "+ reverseString);
	
}
}
