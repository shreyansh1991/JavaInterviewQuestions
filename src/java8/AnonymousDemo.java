package java8;

interface Drawable1 {
	public void draw();
}

public class AnonymousDemo {
	public static void main(String[] args) {
		Drawable1 d = new Drawable1() {
			int x = 100;

			@Override
			public void draw() {
				System.out.println("Hello - " + x);
			}
		};
		d.draw();
	}

}