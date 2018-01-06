package thirtycodingjavainterviewquestions;

import java.util.Scanner;

public class PerfectNumber {
public static void main(String[] args) {
	int count=0;
	System.out.println("Enter the number to check if its perfect number..");
	Scanner sc=new Scanner(System.in);
	int s=sc.nextInt();
	System.out.println("Numbered entered is " +s);
	for(int i=1;i<s;i++)
	{
		if(s%i==0)
		{
			count=count+i;
		}
	}
	if(s==count)
		System.out.println("Given Number is Perfect Number!!!");
	else
		System.out.println("Given number is not a perfect number");
}
}
