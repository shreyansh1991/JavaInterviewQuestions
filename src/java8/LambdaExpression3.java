package java8;

// Java Lambda Expression Example: Single Parameter
interface Sayable1 {
	public String say(String name);
}

public class LambdaExpression3 {
	public static void main(String[] args) {

		// Lambda expression with single parameter.
		Sayable1 s = (name) -> {
			return "Hello " + name;
		};
		System.out.println(s.say("Shreyansh"));

	}
}