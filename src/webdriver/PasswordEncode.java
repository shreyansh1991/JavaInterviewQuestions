package webdriver;

import org.apache.commons.codec.binary.Base64;

public class PasswordEncode {
	public static void main(String[] args) {
		String s = encodePassword("password");
		// System.out.println(s);
		decodePassword(s);
		// System.out.println(y);

	}

	public static String encodePassword(String password) {
		byte encodedPassword[] = Base64.encodeBase64(password.getBytes());
		System.out.println("Password after encryption is " + new String(encodedPassword));

		return new String(encodedPassword);
	}

	public static String decodePassword(String password) {
		byte decodedPassword[] = Base64.decodeBase64(password);
		System.out.println("Password after decryption is " + new String(decodedPassword));

		return new String(decodedPassword);
	}
}
