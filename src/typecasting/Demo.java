package typecasting;

class A {
	public void a() {
		System.out.println("a");
	}
}

class B extends A {
	public void a() {
		System.out.println("B");
	}
}

class C extends B {
	public void a() {
		System.out.println("C");
	}
}

public class Demo extends C {
	public static void main(String[] args) {
		A obj = (A) new C();
		obj.a();
	}
}
