package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerClassDemo {
	public static void main(String[] args) {
		int count=0;
		// Scanner Example - read file line by line in Java using Scanner
		// reading file line by line using Scanner in Java
		System.out.println("Reading file line by line in Java using Scanner");
		Scanner sc = null;
		File file = new File("D:\\Selenium\\xpath.txt");
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				// System.out.println(sc.nextLine());
				System.out.print(count);
			count++;
			/* while(in.hasNextLine()){
	             in.next();
	             value = in.nextInt();
	             //Do something with the value here, maybe store it into an ArrayList.
	        }*/
			boolean b=sc.nextLine().contains("0-9");
			if(b==true)
			{
				
			}
			 
				
					//sc.next();
					
					System.out.println(sc.nextInt());
				 
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
