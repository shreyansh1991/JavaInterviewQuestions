package thirtycodingjavainterviewquestions;

import java.util.Scanner;

public class SumOfDigits {
public static void main(String[] args) {
	int sum=0;
	System.out.println("Enter the number to find the sum of its digit..");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		int a=Integer.parseInt(""+c);
		sum=sum+a;
	}
	System.out.println("The Sum of its digit is "+ sum);
}
}
