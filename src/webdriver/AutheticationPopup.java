package webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutheticationPopup {
	static
	{
		
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		
	//	System.setProperty("webdriver.chrome.driver",
		//		System.getProperty("user.dir") + File.separator + "chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(32,TimeUnit.SECONDS);
		driver.get("https://staging.oto.com/");
		
		
		Robot rb = new Robot();

	     //Enter user name by ctrl-v
	     StringSelection username = new StringSelection("username");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(username, null);            
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	     rb.keyRelease(KeyEvent.VK_V);
	     rb.keyRelease(KeyEvent.VK_CONTROL);

	     //tab to password entry field
	     rb.keyPress(KeyEvent.VK_TAB);
	     rb.keyRelease(KeyEvent.VK_TAB);
	     Thread.sleep(2000);

	     //Enter password by ctrl-v
	     StringSelection pwd = new StringSelection("password");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pwd, null);
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	     rb.keyRelease(KeyEvent.VK_V);
	     rb.keyRelease(KeyEvent.VK_CONTROL);

	     //press enter
	     rb.keyPress(KeyEvent.VK_ENTER);
	     rb.keyRelease(KeyEvent.VK_ENTER); 
		
	
	}
}
