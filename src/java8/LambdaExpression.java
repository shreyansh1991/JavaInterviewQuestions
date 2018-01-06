package java8;

/*Java Lambda Expression Syntax

(argument-list) -> {body}  
Java lambda expression is consisted of three components.

1) Argument-list: It can be empty or non-empty as well.

2) Arrow-token: It is used to link arguments-list and body of expression.

3) Body: It contains expressions and statements for lambda expression.
*/
@FunctionalInterface // It is optional
interface Drawable {
	public void draw();
	default void abc(){}
	
}

public class LambdaExpression {
	public static void main(String[] args) {
		int width = 10;

		// with lambda
		Drawable d = () -> {
			System.out.println("width is --> " + width);
		};

		d.draw();

	}
	
}
