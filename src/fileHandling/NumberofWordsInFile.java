package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NumberofWordsInFile {

	public static void main(String[] args) {
		int count = -2;
		String completeString = "";
		File file = new File("D:\\Selenium\\xpath1.txt");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String s = null;
		try {
			s = br.readLine();
		 System.out.println(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (s != null) {

				// System.out.println(++count);
				completeString = completeString + s;
				// System.out.println(completeString);

				s = br.readLine();
				System.out.println("s - " + s);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(completeString);
		String size[] = completeString.split(" ");

		System.out.println(size.length + "" + count);
	}
}
