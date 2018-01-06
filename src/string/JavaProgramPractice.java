package string;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaProgramPractice {
	public static void main(String[] args) {
		String y = "";
		String z = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of rows:");
		
		int i1 = sc.nextInt();
		String rows[]=new String[i1];
		for (int i = 0; i < i1; i++) {
			System.out.println("Enter " + (i+1) + " String");
			Scanner sc1 = new Scanner(System.in);
			String s1 = sc1.nextLine();
			rows[i]=s1;
		}
		System.out.println();
		System.out.println("Output - ");
		System.out.println();
		for (int i = 0; i <rows.length; i++) {
			
		
			
			
			String sp1[] = rows[i].split(" ");
			for (String a : sp1) {
				if (a.matches("[a-zA-Z]{2}[0-9]{3}")) {

			
					y = a;
				}
				
			}
			System.out.println(sp1[0].toString().substring(0, sp1[0].length() - 1) + "  " + y + "  " + sp1[sp1.length-1].substring(0, sp1[sp1.length-1].length()-1));
			
			
		}
	}
}
