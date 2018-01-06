package other;

public class ProtectedClass {

	public static void main(String[] args) {
		method1();
	}

	static void method1() {

		method2();
	}

	private static void method2() {
		method3();

	}

	private static void method3() {
		method1();
	}

	/*
	 * static void xyz() { abc(); }
	 */
}