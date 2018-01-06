package string;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;

public class PassValidator{

	  private static Pattern pattern;
	  private static Matcher matcher;

	  private static final String PASSWORD_PATTERN =
              "((?=.*\\d)(?=.*[a-z]))";

	  public PassValidator(){
		  pattern = Pattern.compile(PASSWORD_PATTERN);
	  }

	  /**
	   * Validate password with regular expression
	   * @param password password for validation
	   * @return true valid password, false invalid password
	   */
	  public  boolean validate(final String password){

		  matcher = pattern.matcher(password);
		  return matcher.matches();

	  }
	  public static void main(String[] args) {
		System.out.println(new PassValidator().validate("1234k"));
		System.out.println(new PassValidator().validate("kk"));
		System.out.println(new PassValidator().validate("1234"));
	}
}
