package thirtycodingjavainterviewquestions;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		try{
		System.out.println("Enter the number to check if its armstrong..");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		if (s < 0) {
			System.out.println("Please enter positive number.");

		} else {

			int number = s;

			int a = 0;
			int b = 0;
			while (s != 0) {
				a = s % 10;
				b = b + a * a * a;
				s = s / 10;
			}
			if (number == b)
				System.out.println("Given Number is armstrong");
			else
				System.out.println("Given Number is not a armstrong");

		}}catch(Exception e)
		{
			e.printStackTrace();
			return;
		}
		finally{}
	}
}
