package java8;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread t = new Thread(() -> {

			System.out.println("hi");
		});

		t.start();
	}
}
