package help;

import java.util.Scanner;

public class DateQuestion {
	public static void main(String[] args) {
		System.out.println("Enter the count of date u wish to enter dd/mm/yyyy");

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String array[] = new String[count];
		for (int i = 1; i <= count; i++) {
			Scanner sc1 = new Scanner(System.in);
			array[i - 1] = sc1.nextLine();
		}
		System.out.println("Following is your entered date");
		for (int i = 0; i < count; i++) {
			System.out.println(array[i]);
		}
		String temp = "";
		for (int i = 0; i < count; i++) {
			for (int j = 1; j < count; j++) {
				// System.out.println((j - 1) + " : " + array[j - 1]);
				// System.out.println(j + " : " + array[j]);
				String splittedArray[] = array[j - 1].split("/");
				String splittedArray1[] = array[j].split("/");

				if (Integer.parseInt(splittedArray[2]) > Integer.parseInt(splittedArray1[2])) {
					System.out.println(splittedArray[2] + " " + splittedArray1[2]);
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				} else {
					if (Integer.parseInt(splittedArray[2]) == Integer.parseInt(splittedArray1[2])
							&& Integer.parseInt(splittedArray[1]) > Integer.parseInt(splittedArray1[1])) {
						System.out.println((j - 1) + "   :   " + array[j - 1]);
						System.out.println(j + "       :   " + array[j]);
						temp = array[j - 1];
						array[j - 1] = array[j];
						array[j] = temp;
					} else {
						if (Integer.parseInt(splittedArray[2]) == Integer.parseInt(splittedArray1[2])
								&& Integer.parseInt(splittedArray[1]) == Integer.parseInt(splittedArray1[1])
								&& Integer.parseInt(splittedArray[0]) > Integer.parseInt(splittedArray1[0])) {
							System.out.println((j - 1) + "   :   " + array[j - 1]);
							System.out.println(j + "       :   " + array[j]);
							temp = array[j - 1];
							array[j - 1] = array[j];
							array[j] = temp;
						}
					}

				}

			}

		}
		System.out.println("Date in Ascending order ........................");
		for (int i = 0; i < count; i++) {
			System.out.println(array[i]);
		}

	}
}
