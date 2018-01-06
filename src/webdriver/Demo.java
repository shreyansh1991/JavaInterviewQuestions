package webdriver;

/*public class JSDemo {
	public static void main(String[] args) {

	}
}
*/
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	private static WebDriver driver;
	private static String baseUrl;
	

public static void main(String[] args) throws AWTException {
	driver = new FirefoxDriver();
	baseUrl = "https://angular2.maialearning.com/#/interest-profiler";
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.navigate().to(baseUrl);
//	driver.findElement(By.cssSelector(".btn.btn-warning")).click();
	driver.findElement(By.cssSelector(".btn.btn-primary")).click();
}
}