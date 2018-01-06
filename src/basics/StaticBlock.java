package basics;

class A {
	static int i = 1111;
	static {
		System.out.println("A");
		i = i-- - --i;
	}

	{
		System.out.println("B");
		i = i++ + ++i;
	}

}

class B extends A {
	static {
		System.out.println("C");
		i = --i - i--;
	}

	{
		System.out.println("D");
		i = ++i + i++;

	}
}

public class StaticBlock {
	public static void main(String[] args) {
		B ob = new B();
		System.out.println(ob.i);
	}
}
