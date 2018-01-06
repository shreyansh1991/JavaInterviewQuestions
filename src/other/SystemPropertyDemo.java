package other;

public class SystemPropertyDemo {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			Thread.sleep(50);
			System.out.println(System.currentTimeMillis());
		}
		System.setProperty("a", "shreyansh");
		System.out.println(System.getProperty("a"));

		/*
		 * static String clearProperty(String key): Removes the system property
		 * indicated by the specified key.
		 */
		System.clearProperty("a");
		/*
		 * static String getProperty(String key, String def): Gets the system
		 * property indicated by the specified key. Returns: the string value of
		 * the system property, or the default value if there is no property
		 * with that key.
		 */

		System.out.println(System.getProperty("b", "ShreyanshJain"));
		System.out.println(System.nanoTime());
	}
}
