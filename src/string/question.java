package string;

public class question {
public static void main(String[] args) {
	String s="??????????????/bjbjd?vsdjhbvhj@!#*jsbcjd?dcbshjcvhjasvc";
	
	
	String finalString="";
	for(int j=0;j<s.length();j++)
	{
		char c=s.charAt(j);
		if(c=='?')
		{
			finalString=finalString+c;
		}
		
	}
	System.out.println(finalString);
} 
}
