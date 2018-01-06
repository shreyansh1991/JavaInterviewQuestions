package array;

class JavaAlwaysCallByValue {

	private String color;

	public JavaAlwaysCallByValue() {
	}

	public JavaAlwaysCallByValue(String c) {
		this.color = c;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

class Test {

	public static void main(String[] args) {

		JavaAlwaysCallByValue red = new JavaAlwaysCallByValue("Red"); // memory
																		// reference
		//System.out.println("Red -" + red); // 50
		JavaAlwaysCallByValue blue = new JavaAlwaysCallByValue("Blue"); // memory
	//	System.out.println("Blue - " + blue); // reference
		// 100

		swap(red, blue);
		System.out.println("red color=" + red.getColor());
		System.out.println("blue color=" + blue.getColor());

		foo(blue);
		System.out.println("blue color=" + blue.getColor());

	}

	private static void foo(JavaAlwaysCallByValue balloon) { // baloon=100
		balloon.setColor("Red"); // baloon=100
		balloon = new JavaAlwaysCallByValue("Green"); // baloon=200
		balloon.setColor("Blue"); // baloon = 200
	}

	// Generic swap method
	public static void swap(JavaAlwaysCallByValue o1, JavaAlwaysCallByValue o2) {
		JavaAlwaysCallByValue temp = o1;
		o1 = o2;
		o2 = temp;
		o1.setColor("orange");
		o2.setColor("green");

	}
}
