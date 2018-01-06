package help;

import java.util.Scanner;
import java.util.TreeSet;

public class DateQuestion2 {
	public static void main(String[] args) {
		System.out.println("Enter the count of date u wish to enter dd/mm/yyyy");
		TreeSet tree = new TreeSet();
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String array[] = new String[count];
		for (int i = 1; i <= count; i++) {
			Scanner sc1 = new Scanner(System.in);

			tree.add(sc1.nextLine());
		}
		System.out.println("Following is your entered date");
		/*for (int i = 0; i < count; i++) {
			System.out.println(array[i]);
		}*/
		System.out.println(tree);

	}
}
