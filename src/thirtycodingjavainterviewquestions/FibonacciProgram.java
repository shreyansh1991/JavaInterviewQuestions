package thirtycodingjavainterviewquestions;

public class FibonacciProgram {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a + " " + b);
		for (int i = 0; i < 10; i++) {
			c = a + b;
			

			a = b;
			b = c;
			if (c < 100)
				System.out.print(" " + c);
			
		}
	}
}
