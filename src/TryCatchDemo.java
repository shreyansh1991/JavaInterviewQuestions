
public class TryCatchDemo {
	public static void main(String[] args) {
		Main.returnValue();
	}
}

class Main {
	public static void returnValue() {
		try {
			int a = 10 / 0;
		//	return 100;
		} catch (Exception e) {
			try {
				int a = 100 / 0;
			} catch (Exception e1) {
				System.out.println("yo");
			}
		}
	finally {
			System.out.println("Hello World.");
		}
		System.out.println("hi");
	}
}
