package webdriver;

//import org.junit.Assert;
import org.testng.Assert;

public class AssertDemo {
	public static void main(String[] args) {
		// Assert.assertTrue("expected and actual not matched",true);
		String a1 = "ram";
		String a = "ramu";
		Assert.assertTrue(a1.equals(a), "expected - " + a1 + " actual - " + a); // TestNG
																				// Assert
		// Assert.assertTrue("expected - "+a1+" actual - "+a, a1.equals(a)); //
		// Junit Assert
	}
}
