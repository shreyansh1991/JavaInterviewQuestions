package webdriver;

import java.io.File;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {
	private static Logger logger = Logger.getLogger(Demo1.class.getName());

	@BeforeTest
	public void init() {
		PropertyConfigurator.configure("D:\\Selenium\\interviewquestions\\javainterviewquestions\\properties\\log.properties");
	}

	@Test
	public static void abc() {
		logger.info("hi");

		
		/*  WebDriver driver = new FirefoxDriver();
		  RemoteWebDriver
		 * 
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(32, TimeUnit.SECONDS);
		 * driver.get("C:\\Users\\Shreyansh\\Desktop\\demo1.html"); WebElement
		 * table = driver.findElement(By.id("demo")); List<WebElement> rows =
		 * table.findElements(By.tagName("tr")); System.out.println("row size-"
		 * + rows.size()); for (int i = 0; i < rows.size(); i++) {
		 * List<WebElement> cols = rows.get(i).findElements(By.xpath("td[" + 3 +
		 * "]/a")); System.out.println("cols -" + cols.size()); for (int j = 0;
		 * j < cols.size(); j++) { String name = cols.get(j).getText();
		 * System.out.println("link text - " + name); if
		 * (name.equals("facebook")) { cols.get(j).click(); break; }
		 * 
		 * 
		 * } }
		 */
		logger.info("Completed");
	}

}
