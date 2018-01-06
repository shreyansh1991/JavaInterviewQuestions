package help;

import org.testng.Assert;

public class Demo {
	public static void main(String[] args) {
		String s = "expected";
		String s1 = "actual";
		try {

			System.out.println("Testcase done");
		} catch (Exception e) {
			System.out.println("Exception - " + e.getLocalizedMessage());
			// Assert.assertTrue(false);
		}
		Assert.assertTrue(s.equals(s1), "exception");
	}
}
