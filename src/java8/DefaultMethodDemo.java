package java8;

interface Right {
	default void m1() {
		System.out.println("Right");
	}

}
interface Left {
	default void m1() {
		System.out.println("Left");
	}
}



class DefaultMethodDemo implements Right,Left {
	public static void main(String[] args) {
		new DefaultMethodDemo().m1();
	}

	public void m1() {
		System.out.println("My own implementation");
		Left.super.m1();
		Right.super.m1();
		
	}
}