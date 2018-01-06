package java8;

@FunctionalInterface
interface Demo {
	public void run1();
}

public class LambdaExpressionDemo {
	public static void main(String[] args) {
		run1();
	}

	public static void run1() {
		Demo d = () -> {
			System.out.println("he");
		};
		d.run1();
	}

}
