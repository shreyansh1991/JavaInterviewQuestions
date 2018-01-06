package string;

public class StringSwap {
public static void main(String[] args) {
	String s1="Shreyansh";
	String s2="Jain";
	String s3=s1+s2;
	s2=s3.substring(0,s1.length());
	s1=s3.substring(s1.length(),s3.length());
System.out.println(s1 +  "  :  "+ s2);	
}
}
