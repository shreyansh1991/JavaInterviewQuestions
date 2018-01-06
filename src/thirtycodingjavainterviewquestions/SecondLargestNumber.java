package thirtycodingjavainterviewquestions;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int largest = 0;
		int secLargest = 0;
		int a[] = { 1, 45, 85, 96, 12, 54, 11, 13, 65, 85, 99 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				secLargest = largest;
				largest = a[i];

			} else if (a[i] > secLargest) {
				secLargest = a[i];
			}
		}
		System.out.println(secLargest);
	}
}
