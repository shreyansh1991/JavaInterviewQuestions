package array;

class Demo {
	public static void main(String[] args) {
		Integer i = new Integer(50);
		Integer j = new Integer(100);
		System.out.println("Before Swaping -" + i + " " + j);

		swap(i, j);
		System.out.println("After Swaping -" + i + " " + j);

	}

	private static void swap(Integer a, Integer b) {
		int temp = a;
		a=b;
		b = temp;

	}
}
