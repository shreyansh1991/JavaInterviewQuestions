package string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaProgramPractice1 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Shreyansh\\Desktop\\test.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String s = br.readLine();
		while (s != null) {

			s = s.replaceAll("[^\\d+]", "");
			System.out.println(s);
			if (s.matches("[(0|91|7|8|9)][0-9]{9}")) {
				System.out.println(s.substring(0, 10));
			}
			

			s = br.readLine();

		}
	}
}
